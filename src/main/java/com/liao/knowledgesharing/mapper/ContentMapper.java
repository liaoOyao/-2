package com.liao.knowledgesharing.mapper;

import com.liao.knowledgesharing.domain.Content;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKeyWithBLOBs(Content record);
}