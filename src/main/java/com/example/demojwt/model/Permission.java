package com.example.demojwt.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "permission")
@Getter
@Setter
public class Permission extends  BaseEntity{

    private String permissionName;

    private String permissionKey;

}
