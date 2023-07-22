package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;


class Sample1 {
  public String result() {
    return "test";
  }
}

@SpringBootTest
class ApplicationTests {

  @Test
  void contextLoads() {
  }
  
  @Test
  public void Sample1Test() {
    Sample1 sample1 = new Sample1();
    assertEquals(sample1.result(), "test");
  }
}
