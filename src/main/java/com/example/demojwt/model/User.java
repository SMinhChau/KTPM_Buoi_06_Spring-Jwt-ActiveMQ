package com.example.demojwt.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
}
