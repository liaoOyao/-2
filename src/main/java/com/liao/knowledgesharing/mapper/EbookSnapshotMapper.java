package com.liao.knowledgesharing.mapper;

import com.liao.knowledgesharing.domain.EbookSnapshot;
import org.springframework.stereotype.Repository;

@Repository
public interface EbookSnapshotMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EbookSnapshot record);

    int insertSelective(EbookSnapshot record);

    EbookSnapshot selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EbookSnapshot record);

    int updateByPrimaryKey(EbookSnapshot record);
}