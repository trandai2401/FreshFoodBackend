package com.freshfood.hola.controller;

import com.freshfood.hola.model.User;
import com.freshfood.hola.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Optional;
@RestController
@RequestMapping("api/check")
public class Check {
    @Autowired
    private IUserService userService;

    @GetMapping("username")
    ResponseEntity<?> checkUsername(@RequestParam String q){
        Optional<User> user = userService.findByUsername(q) ;
//        System.out.println(q);
        return ResponseEntity.ok(user.isEmpty());
    }
    @GetMapping("email")
    ResponseEntity<?> checkEmail(@RequestParam String q){
        Optional<User> user = userService.findByEmail(q) ;
        System.out.println(user.toString());
        return ResponseEntity.ok(user.isEmpty());
    }
}
