package com.example.demojwt.service;

import com.example.demojwt.model.User;
import com.sun.security.auth.UserPrincipal;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
