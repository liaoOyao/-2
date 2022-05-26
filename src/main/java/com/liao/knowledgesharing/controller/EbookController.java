package com.liao.knowledgesharing.controller;

import com.liao.knowledgesharing.req.EbookReq;
import com.liao.knowledgesharing.resp.CommonResp;
import com.liao.knowledgesharing.resp.EbookResp;
import com.liao.knowledgesharing.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;
    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list= ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
