package com.example.firstspringproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(FirstspringprojectApplication.class)
class FirstspringprojectApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void testHomeEndpoint() throws Exception {
    // Perform GET request to "/" and expect "Hello World!"
    mockMvc
      .perform(MockMvcRequestBuilders.get("/"))
      .andExpect(MockMvcResultMatchers.status().isOk())
      .andExpect(MockMvcResultMatchers.content().string("Hello World!"));
  }
}
