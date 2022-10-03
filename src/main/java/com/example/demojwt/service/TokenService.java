package com.example.demojwt.service;

import antlr.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
