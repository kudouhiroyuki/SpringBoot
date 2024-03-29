package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
    int test1 = 1;
    int test2 = test1 + 1;
    int test3 = test1 - 1;
    int test4 = test1 * 1;
    assertEquals(test1, 1);
    assertEquals(test2, 2);
    assertEquals(test3, 0);
    assertEquals(test4, 1);
    
    int[] test5 = new int[3];
    test5[0] = 1;
    assertEquals(test5.length, 3);
    assertEquals(test5[0], 1);
    assertEquals(test5[1], 0);
    assertEquals(test5[2], 0);
    
    int[] test6 = {1, 2, 3};
    assertEquals(test6.length, 3);
    assertEquals(test6[0], 1);
    assertEquals(test6[1], 2);
    assertEquals(test6[2], 3);
    
    String[] test7 = {"one", "two", "three"};
    assertEquals(test7[0], "one");
    
    List<String> test8 = new ArrayList<>();
    test8.add("one");
    assertEquals(test8.size(), 1);
    assertEquals(test8.get(0), "one");
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
