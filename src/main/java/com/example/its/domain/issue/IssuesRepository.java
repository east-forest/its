package com.example.its.domain.issue;

import org.apache.ibatis.annotations.*;

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

    @Delete("delete from issues where id=${issueId}")
    void delete(long issueId);
}
