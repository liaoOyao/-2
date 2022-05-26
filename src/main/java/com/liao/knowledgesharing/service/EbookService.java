package com.liao.knowledgesharing.service;


import com.liao.knowledgesharing.domain.Ebook;
import com.liao.knowledgesharing.mapper.EbookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {
//    @Resource
    @Autowired
    private EbookMapper ebookMapper;
    public List<Ebook> list()
    {
        return ebookMapper.selectList();
    }
}
