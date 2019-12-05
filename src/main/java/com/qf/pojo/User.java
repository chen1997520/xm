package com.qf.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private  String tel;
    private  String photo;
    private  String sex;
    private  String sign;
    private  String pass;
    private  String qq;
    private Integer zhifu;
}
