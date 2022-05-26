package com.liao.knowledgesharing.mapper;

import com.liao.knowledgesharing.domain.Ebook;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EbookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ebook record);

    int insertSelective(Ebook record);

    Ebook selectByPrimaryKey(Long id);
    List<Ebook> selectList();

    int updateByPrimaryKeySelective(Ebook record);

    int updateByPrimaryKey(Ebook record);
}