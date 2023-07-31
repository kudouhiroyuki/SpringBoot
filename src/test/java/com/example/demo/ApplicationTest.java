package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;


class Test2 {
  public String result() {
    return "test2";
  }
}
class Test3 {
  public String result(String text) {
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
    Test2 test2 = new Test2();
    assertEquals(test2.result(), "test2");
  }
  
  @Test
  public void Test3() {
    Test3 test3 = new Test3();
    assertEquals(test3.result("test3"), "test3");
  }
}
