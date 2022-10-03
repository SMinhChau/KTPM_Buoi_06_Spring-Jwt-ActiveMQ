package com.example.demojwt.controller;


import com.example.demojwt.model.Token;
import com.example.demojwt.model.User;
import com.example.demojwt.service.TokenService;
import com.example.demojwt.service.UserService;
import com.example.demojwt.util.JwtTokenUtil;
import com.sun.security.auth.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private JwtTokenUtil jwtUtil;

    @Autowired
    private TokenService tokenService;


    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user){
        UserPrincipal userPrincipal =
return null;

    }


}
