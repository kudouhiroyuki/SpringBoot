package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Data;

@Data
class TestEntity {
  private String message;
}

@RestController
@RequestMapping("/api") 
public class ApiController {

  @GetMapping("/test1")
  public String getTest1() {
    return "test1";
  }

  @GetMapping("/test2")
  public String getTest2(@RequestParam("message") String message) {
    return message;
  }
  
  @GetMapping("test3")
  public TestEntity getTest3() {
    TestEntity result = new TestEntity();
    return result;
  }
  
  @GetMapping("test4")
  public TestEntity getTest4() {
    TestEntity result = new TestEntity();
    result.setMessage("test4");
    return result;
  }
}

// curl -v -X GET "http://localhost:8080/api/test1"
// curl -v -X GET "http://localhost:8080/api/test2?message=test2"
// curl -v -X GET "http://localhost:8080/api/test3"
// curl -v -X GET "http://localhost:8080/api/test4"
