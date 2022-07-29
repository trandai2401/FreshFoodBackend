package com.freshfood.hola.controller;

import com.freshfood.hola.model.User;
import com.freshfood.hola.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/users")
@RestController
public class UserAPI {
    @Autowired
    private IUserService userService;


    @GetMapping("")
    public ResponseEntity<?> getUsers() {

        return ResponseEntity.ok("Helooo");
    }

    @PostMapping("")
    public ResponseEntity<?> createUser(@RequestBody User user) {
//        userService.save
        return ResponseEntity.ok( userService.save(user));
    }
}
