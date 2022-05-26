package com.liao.knowledgesharing.service;


import com.liao.knowledgesharing.domain.Ebook;
import com.liao.knowledgesharing.domain.EbookExample;
import com.liao.knowledgesharing.mapper.EbookMapper;
import com.liao.knowledgesharing.req.EbookReq;
import com.liao.knowledgesharing.resp.EbookResp;
import com.liao.knowledgesharing.utils.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
//        List<EbookResp> respList=new ArrayList<>();
//        for (Ebook ebook : ebookList) {
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp);
//对象复制
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }
        //列表复制
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return list;
    }
}
