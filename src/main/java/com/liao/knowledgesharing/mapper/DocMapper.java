package com.liao.knowledgesharing.mapper;

import com.liao.knowledgesharing.domain.Doc;
import org.springframework.stereotype.Repository;

@Repository
public interface DocMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Doc record);

    int insertSelective(Doc record);

    Doc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Doc record);

    int updateByPrimaryKey(Doc record);
}