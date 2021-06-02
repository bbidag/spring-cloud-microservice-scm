package com.bbidag.microservice.scm.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {

  private String productId;
  private String categoryName;
  private String name;
  private int price;

}
