package com.example.its.web.issue;

import com.example.its.domain.issue.issueEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class issueController {

    @GetMapping("/issues")
    public String showList(Model model) {
        var issueList = List.of(
                new issueEntity(1, "概要１", "説明１"),
                new issueEntity(2, "概要２", "説明２"),
                new issueEntity(3, "概要３", "説明３")
        );
        model.addAttribute("issueList", issueList);
        return "issues/list";
    }
}
