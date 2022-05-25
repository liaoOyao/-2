package com.liao.knowledgesharing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//返回字符串
//@Controller //返回页面
public class TestController {
    /**
     * 常见http请求 四种 GET POST PUT DELETE
     *                 查询  新增  修改  删除
     * @return
     */
    @Value("${test.hello:test}")
    private  String testhello;
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello world！"+testhello;
    }
    @RequestMapping("/hello/post")
    public String hello(String name)
    {
        return "hello world！post"+name;
    }
}
