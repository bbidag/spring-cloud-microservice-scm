package com.bbidag.microservice.scm.entity;

import com.bbidag.microservice.scm.constant.Category;
import java.util.List;
import java.util.UUID;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fruit extends Product {

  @Builder
  public Fruit(String productId, String productName, int price) {
    super(productId, Category.FRUIT.getCategoryName(), productName, price);
  }

  public static List<Product> dummyFruits(){
    return List.of(
        Fruit.builder()
            .productId(UUID.randomUUID().toString())
            .productName("사과")
            .price(12000)
            .build(),
        Fruit.builder()
            .productId(UUID.randomUUID().toString())
            .productName("배")
            .price(20000)
            .build(),
        Fruit.builder()
            .productId(UUID.randomUUID().toString())
            .productName("포도")
            .price(5000)
            .build()
    );
  }

}
