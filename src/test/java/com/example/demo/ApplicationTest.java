package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

class Sample {
  public String test2() {
    return "test2";
  }
	
  public String test3(String text) {
    return text;
  }

  public String test4() {
	String text = "test4";
    return text;
  }
}

@SpringBootTest
class ApplicationTests {

  @BeforeAll
  static void beforeAll() {
    System.out.println("1番最初に１度だけ実行される。メソッドはstaticである必要がある");
  }
  @BeforeEach
  public void beforeEach() {
    System.out.println("付与されたメソッドは、各テストメソッドの前に毎回実行される");
  }
  @AfterAll
  static void afterAll() {
    System.out.println("付与されたメソッドは、1番最後に１度だけ実行される。メソッドはstaticである必要がある");
  }
  @AfterEach
  public void afterEach() {
    System.out.println("付与されたメソッドは、各テストメソッドの後に毎回実行される");
  }
  
  @Test
  public void Test1() {
    assertEquals(12, 12);
  }
  
  @Test
  public void Test2() {
	Sample sample = new Sample();
    assertEquals(sample.test2(), "test2");
  }
  
  @Test
  public void Test3() {
	Sample sample = new Sample();
    assertEquals(sample.test3("test3"), "test3");
  }
  
  @Test
  public void Test4() {
	Sample sample = new Sample();
    assertEquals(sample.test4(), "test4");
  }
}
