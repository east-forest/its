package com.example.its.web.issue;

import com.example.its.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/issues")
@RequiredArgsConstructor
public class IssueController {

    private final IssueService issueService;

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("issueList", issueService.findAll());
        return "list";
    }

    @GetMapping("/creationForm")
    public String showCreationForm(@ModelAttribute IssueForm form) { //←このように記載することで、ModelのなかにIssueFormが自動登録される
        return "issues/creationForm";
    }

    //　登録後、一覧画面に戻る流れ
    @PostMapping
    public String create(@Validated IssueForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return showCreationForm(form);
        }
        issueService.create(form.getSummary(), form.getDescription());

        return "redirect:/issues"; //リダイレクト処理
    }

    @GetMapping("/{issueId}")
    public String showDetail(@PathVariable("issueId") long issueId, Model model) {
        model.addAttribute("issue", issueService.findById(issueId));
        return "issues/detail";
    }

    // 更新機能
    @PostMapping(value = "/detail", params = "update")
    public String update(@Validated IssueDetailForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return showDetail(form.getId(), model);
        }

        issueService.update(form.getId(), form.getSummary(), form.getDescription());
        return "redirect:/issues";
    }

    // 削除機能
    @PostMapping(value = "/detail", params = "delete")
    public String delete(@Validated IssueDetailForm form) {
        issueService.delete(form.getId());
        return "redirect:/issues";
    }
}
