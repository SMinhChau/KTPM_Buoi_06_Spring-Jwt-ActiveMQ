package com.example.demojwt.service;

import com.example.demojwt.authen.UserPrincipal;
import com.example.demojwt.model.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
