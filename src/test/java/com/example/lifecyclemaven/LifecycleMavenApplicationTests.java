package com.example.lifecyclemaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class LifecycleMavenApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  void testRunMvnTest(){

    String actual = "mvn test";
    Assertions.assertEquals("mvn test", actual);


  }

}
