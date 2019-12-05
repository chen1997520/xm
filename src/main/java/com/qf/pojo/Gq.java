package com.qf.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Gq {
   private  Goods goods;
   private User user;
   private String qq;
   private List<String> list;
}
