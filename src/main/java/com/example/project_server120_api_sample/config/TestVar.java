package com.example.project_server120_api_sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//환경변수 읽기
@Component
public class TestVar {

    @Value("${spring.datasource.url}")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
