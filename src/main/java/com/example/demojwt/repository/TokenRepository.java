package com.example.demojwt.repository;

import antlr.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository  extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
