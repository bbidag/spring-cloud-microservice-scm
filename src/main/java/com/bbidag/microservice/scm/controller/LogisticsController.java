package com.bbidag.microservice.scm.controller;

import com.bbidag.microservice.scm.entity.Fruit;
import com.bbidag.microservice.scm.entity.Product;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogisticsController {

  @GetMapping("/fruits/all")
  public ResponseEntity<List<Product>> allFruits(){
    log.info("Print all fruits.");
    return new ResponseEntity<>(Fruit.dummyFruits(), HttpStatus.OK);
  }

}
