package com.liao.knowledgesharing.service;


import com.liao.knowledgesharing.domain.Ebook;
import com.liao.knowledgesharing.domain.EbookExample;
import com.liao.knowledgesharing.mapper.EbookMapper;
import com.liao.knowledgesharing.req.EbookReq;
import com.liao.knowledgesharing.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
//    @Resource
    @Autowired
    private EbookMapper ebookMapper;
    public List<EbookResp> list(EbookReq req)
    {
        EbookExample ebookExample=new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();//Criteria相当于where
        criteria.andNameLike("%"+req.getName()+"%");

        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> respList=new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);
            respList.add(ebookResp);
        }
        return respList;
    }
}
