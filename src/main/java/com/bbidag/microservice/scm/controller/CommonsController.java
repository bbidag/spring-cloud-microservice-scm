package com.bbidag.microservice.scm.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonsController {

  @Autowired
  private DiscoveryClient discoveryClient;

  @GetMapping("/services/all")
  public ResponseEntity<List<String>> getServices(){
    return new ResponseEntity<>(discoveryClient.getServices(), HttpStatus.OK);
  }

  @GetMapping("/{serviceName}/instances")
  public ResponseEntity<List<String>> getInstancesByService(@PathVariable String serviceName){
    return new ResponseEntity<>(discoveryClient.getInstances(serviceName).stream()
      .map(ServiceInstance::getInstanceId).collect(Collectors.toList()), HttpStatus.OK);
  }

}
