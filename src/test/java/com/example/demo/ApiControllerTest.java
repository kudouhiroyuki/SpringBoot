package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.demo.entity.EmployeeEntity;

@SpringBootTest
@AutoConfigureMockMvc
class ApiControllerTest {

  @Autowired
  private MockMvc mockMvc;
  
  @Test
  void getTest1() throws Exception {
    this.mockMvc.perform(get("/api/test1"))
      .andExpect(status().isOk())
      .andExpect(content().string("test1"));
  }
  
  @Test
  void getTest2() throws Exception {
    this.mockMvc.perform(get("/api/test2").param("param1", "test2"))
      .andExpect(status().isOk())
      .andExpect(content().string("test2"));
  }
  
  @Test
  void getTest3() throws Exception {
    this.mockMvc.perform(get("/api/test3").param("param1", "test3"))
      .andExpect(status().isOk())
      .andExpect(content().json("{param1: test3}"));
  }
  
  @Test
  void getTest4() throws Exception {
    this.mockMvc.perform(get("/api/test4/1"))
      .andExpect(status().isOk())
      .andExpect(content().string("1"));
  }
  
  @Test
  void getEmployeeAll() throws Exception {
    this.mockMvc.perform(get("/api/employees"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$[0].id").value(1))
      .andExpect(jsonPath("$[0].userName").value("名前"));
  }
}
