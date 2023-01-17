package com.example.project_server120_api_sample.controller;

import java.util.Map;

import com.example.project_server120_api_sample.dto.MemberDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

//    Mono에 감싸서 받도록 해서, 비동기적으로 처리를 chain/compose으로 할 수 있다. (참고로 Mono에서 감싸지 않고 String으로 받은 경우는 논블러킹으로 동기화 처리)
//    Mono는 1 또는 0 요소의 Publisher
    @PostMapping("/echo")
    Mono<String> echo(@RequestBody Mono<String> body) {
        return body.map(String::toUpperCase);
    }

    // http://localhost:8080/api/v1/post-api/default
    @PostMapping(value = "/default")
    public String postMethod() {
        return "Hello World!";
    }

    // http://localhost:8080/api/v1/post-api/member
    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

    /*
    param.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));
     */

        return sb.toString();
    }

    // http://localhost:8080/api/v1/post-api/member2
    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }

}
