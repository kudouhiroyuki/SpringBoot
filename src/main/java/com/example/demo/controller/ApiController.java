package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.Data;

import com.example.demo.service.EmployeeService;
import com.example.demo.entity.EmployeeEntity;

@Data
class TestRequest {
  private String param1;
}
@Data
class TestEntity {
  private String message;
}

@RestController
@RequestMapping("/api") 
public class ApiController {
  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/test1")
  public String getTest1() {
    return "test1";
  }

  @GetMapping("/test2")
  public String getTest2(@RequestParam("param1") String param1) {
    return param1;
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
  
  @GetMapping("test7")
  public ResponseEntity<String> getTest7() {
    return new ResponseEntity<>("test7", HttpStatus.OK);
  }
  
  @GetMapping("test8")
  public ResponseEntity<String> getTest8() {
    return ResponseEntity.ok().body("test8");
  }
  
  @GetMapping("test9")
  public ResponseEntity<String> getTest9() {
    return ResponseEntity.status(HttpStatus.OK).body("test9");
  }
  
  @GetMapping("error1")
  public ResponseEntity<String> getError1() {
    return ResponseEntity.badRequest().body("Bad Request");
  }
  
  @GetMapping("error2")
  public ResponseEntity<String> getError2() {
    return ResponseEntity.notFound().build();
  }
  
  @GetMapping("error3")
  public void getError3() {
    throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
  }
  
  @GetMapping("error4")
  public void getError4() {
    throw new ResponseStatusException(HttpStatus.NOT_FOUND);
  }
  
  @GetMapping("employees")
  public List<EmployeeEntity> getEmployeeAll() {
    List<EmployeeEntity> employees = employeeService.findEmployeeAll();
    return employees;
  }
}

// curl -v -X GET "http://localhost:8080/api/test1"
// curl -v -X GET "http://localhost:8080/api/test2?param1=test2"
// curl -v -X GET "http://localhost:8080/api/test3?param1=test3"
// curl -v -X GET "http://localhost:8080/api/test4/1"
// curl -v -X GET "http://localhost:8080/api/test5"
// curl -v -X GET "http://localhost:8080/api/test6"
// curl -v -X GET "http://localhost:8080/api/test7"
// curl -v -X GET "http://localhost:8080/api/test8"
// curl -v -X GET "http://localhost:8080/api/test9"

// curl -v -X GET "http://localhost:8080/api/error1"
// curl -v -X GET "http://localhost:8080/api/error2"
// curl -v -X GET "http://localhost:8080/api/error3"
// curl -v -X GET "http://localhost:8080/api/error4"

// curl -v -X GET "http://localhost:8080/api/employees"



