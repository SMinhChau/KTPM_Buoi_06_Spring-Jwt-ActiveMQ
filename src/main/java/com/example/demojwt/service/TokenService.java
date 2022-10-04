package com.example.demojwt.service;


import com.example.demojwt.model.Token;

public interface TokenService {
    Token createToken(Token token);

Token findByToken(String token);
}
