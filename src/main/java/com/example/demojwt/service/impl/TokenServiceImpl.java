package com.example.demojwt.service.impl;

import antlr.Token;
import com.example.demojwt.repository.TokenRepository;
import com.example.demojwt.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    @Override
    public Token createToken(Token token) {
        // TODO Auto-generated method stub
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        // TODO Auto-generated method stub
        return tokenRepository.findByToken(token);
    }

}
