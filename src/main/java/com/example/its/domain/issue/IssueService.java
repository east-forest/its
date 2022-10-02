package com.example.its.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IssueService {

    private final IssuesRepository issuesRepository;

    public List<IssueEntity> findAll() {
        return issuesRepository.findAll();
    }

    @Transactional
    public void create(String summary, String description) {
        issuesRepository.insert(summary, description);
    }

    public IssueEntity findById(long issueId) {
        return issuesRepository.findById(issueId);
    }
}
