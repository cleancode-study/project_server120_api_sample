package com.example.project_server120_api_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

//functional endpoints 방식에서 요청을 처리하기 위한 bean들을 정의
//@EnableWebFlux 어노테이션을 사용하면 부트의 webflux 설정을 사용하지 않고, 웹플럭스에 대한 완전한 컨트롤을 가져오겠다는 의미
//부트의 웹플럭스를 사용하고 싶지 않을 때에만 @EnableWebFlux 어노테이션을 사용
@SpringBootApplication
@EnableWebFlux
public class ProjectServer120ApiSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectServer120ApiSampleApplication.class, args);
    }

}
