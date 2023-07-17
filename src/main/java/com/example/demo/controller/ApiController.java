package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.Data;

@Data
class TestRequest {
  private String message;
}
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
  
  @GetMapping("/test3")
  public TestRequest getTest3(TestRequest request) {
    return request;
  }

  @GetMapping("/test4/{id}")
  public String getTest4(@PathVariable String id) {
    return id;
  }
  
  @GetMapping("test5")
  public TestEntity getTest5() {
    TestEntity result = new TestEntity();
    return result;
  }
  
  @GetMapping("test6")
  public TestEntity getTest6() {
    TestEntity result = new TestEntity();
    result.setMessage("test6");
    return result;
  }
}

// curl -v -X GET "http://localhost:8080/api/test1"
// curl -v -X GET "http://localhost:8080/api/test2?message=test2"
// curl -v -X GET "http://localhost:8080/api/test3?message=test3"
// curl -v -X GET "http://localhost:8080/api/test4/1"
// curl -v -X GET "http://localhost:8080/api/test5"
// curl -v -X GET "http://localhost:8080/api/test6"
