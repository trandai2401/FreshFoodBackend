package com.freshfood.hola.controller;


import com.freshfood.hola.dto.JwtResponse;
import com.freshfood.hola.model.User;
import com.freshfood.hola.service.JwtService;
import com.freshfood.hola.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@CrossOrigin("*")
@RestController
public class AuthController {
    @Autowired
    private  AuthenticationManager authenticationManager;
    @Autowired
    private  JwtService jwtService;
    @Autowired
    private  IUserService userService;



    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtService.generateTokenLogin(authentication);
//        System.out.println("token la : "+jwtService.getUserNameFromJwtToken(jwt));
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        User currentUser = userService.findByUsername(user.getUsername()).get();
       
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        // Tr??? v??? jwt cho ng?????i d??ng.
//        String jwt = tokenProvider.generateToken((User) authentication.getPrincipal());
//        
//        
//        String username = jwtService.getUserNameFromJwtToken(jwt);
       
        return ResponseEntity.ok(new JwtResponse(jwt, currentUser.getId(), userDetails.getUsername(), currentUser.getFullName(), userDetails.getAuthorities()));
    }
    
    @PostMapping("/demo")
    public ResponseEntity<?> login() {
        Optional<User> user = userService.demo();
        return ResponseEntity.ok("Hi v???ng v??o m??y nha");
    }
    @PostMapping("/username")
    public ResponseEntity<?> getUsername() {
        String username="";
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
             username = authentication.getName();

        }
        System.out.println(username);
        return ResponseEntity.ok(authentication);

    }

}