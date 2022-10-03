package com.example.its.domain.issue;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface IssuesRepository {

    @Select("select * from issues")
    List<IssueEntity> findAll();

    @Insert("insert into issues(summary, description) values (#{summary}, #{description})")
    void insert(String summary, String description);

    @Select("select * from issues where id=${issueId}")
    IssueEntity findById(long issueId);

    @Update("update issues set summary=#{summary}, description=#{description} where id=${issueId}")
    void update(long issueId, String summary, String description);
}
