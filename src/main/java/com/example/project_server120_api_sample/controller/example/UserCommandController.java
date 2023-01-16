//package com.example.project_server120_api_sample.controller.example;
//
//import io.swagger.annotations.Api;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Mono;
//
//@Api(tags = {"유저 등록, 수정"})
//@RequiredArgsConstructor
//@RestController
//@RequestMapping("/api/users")
//public class UserCommandController {
//
//    private final UserCommandService userCommandService;
//
//    @PutMapping
//    public ResponseEntity<Mono<UserUpsertResponse>> upsertUser(
//            @RequestBody UserUpsertRequest request
//    ) {
//        return ResponseEntity.ok(userCommandService.upsertUser(request));
//    }
//}
