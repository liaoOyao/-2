package com.liao.knowledgesharing.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class crosConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")//針對所有請求地址
//                .allowedOrigins("*")//允許所有來源，棄用，否則會報錯
                .allowedOriginPatterns("*")
                .allowedHeaders("*")
                .allowedMethods("*")
                .allowCredentials(true)//允許前端帶上憑證
                .maxAge(3600);//一個小時不校驗opttions請求
    }
}
