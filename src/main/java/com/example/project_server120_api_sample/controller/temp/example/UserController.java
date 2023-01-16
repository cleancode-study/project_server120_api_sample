//package com.example.project_server120_api_sample.controller.example;
//
//import com.example.project_server120_api_sample.dto.User;
//import com.example.project_server120_api_sample.dto.UserAddDto;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//public class UserController {
//
//    private List<User> users = new ArrayList<>();
//    private int id = 0;
//
//    // User 추가
//    @PostMapping("/user")
//    public String add(@RequestBody UserAddDto user) {
//        users.add( new User(id, user.getNickname(), user.getPassword()) );
//        id ++;
//        return "User 추가 완료";
//    }
//
//    // User 조회
//    @GetMapping("/user/{id}")
//    public User findById(@PathVariable int id) {
//        return users.get(id);
//    }
//
//    // User 전체 조회
//    @GetMapping("/users")
//    public List<User> findAll() {
//        return users;
//    }
//}
