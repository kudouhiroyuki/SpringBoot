package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;


class Sample1 {
  public String result() {
    return "test";
  }
}
class Sample2 {
  public String result(String text) {
    return text;
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
  
  @Test
  public void Sample2Test() {
    Sample2 sample2 = new Sample2();
    assertEquals(sample2.result("test"), "test");
  }
}
