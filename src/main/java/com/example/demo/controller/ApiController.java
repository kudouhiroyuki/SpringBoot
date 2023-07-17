package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CommentEntity;
import com.example.demo.entity.PostEntity;

import java.sql.Date;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Data;

@Data
class Test2Entity {
  private String message;
}

@RestController
@RequestMapping("/api") 
public class ApiController {

  @GetMapping("/test1")
  public String getTest1(Model model) {
    return "test1";
  }
  
  @GetMapping("test2")
  public Test2Entity getTest2(Model model) {
    Test2Entity result = new Test2Entity();
    result.setMessage("test2");
    return result;
  }
}

// curl -v -X GET "http://localhost:8080/api/test1"
// curl -v -X GET "http://localhost:8080/api/test2"
