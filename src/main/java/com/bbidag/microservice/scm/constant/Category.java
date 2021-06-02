package com.bbidag.microservice.scm.constant;

import lombok.Getter;

@Getter
public enum Category {

  FRUIT("1234","과일");

  Category(String categoryId, String categoryName){
    this.categoryId = categoryId;
    this.categoryName = categoryName;
  }

  private final String categoryId;
  private final String categoryName;

}
