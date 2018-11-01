package com.github.lgigek.controllers;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerTest {

    @Autowired
    private MockMvc mockmvc;

    @Test
    @DisplayName("It should return 200 when perform a get")
    public void a() throws Exception {

        mockmvc.perform(get("/greeting")).andExpect(status().isOk());
    }

    @Test
    @DisplayName("It should return \"Hello, World!\" if there is no 'value'")
    public void b() throws Exception {

        mockmvc.perform(get("/greeting")).
                andExpect(jsonPath("$.content", "Hello, World!").exists());
    }

    @Test
    @DisplayName("It should return \"Hello, Lucas!\" if value is Lucas")
    public void c() throws Exception {

        mockmvc.perform(get("/greeting")
                .param("value", "Lucas"))
                .andExpect(jsonPath("$.content", "Hello, Lucas!").exists());
    }

}
