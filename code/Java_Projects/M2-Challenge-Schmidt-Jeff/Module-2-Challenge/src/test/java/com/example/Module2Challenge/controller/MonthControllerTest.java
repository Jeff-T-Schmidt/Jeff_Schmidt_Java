package com.example.Module2Challenge.controller;

import com.example.Module2Challenge.model.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)

//Tests taken from the Record Store class activity

public class MonthControllerTest {
    // Wiring in the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();


    @Test
    public void shouldReturnAllRecordsInCollection() throws Exception {

        // ARRANGE and ACT
        mockMvc.perform(get("/month"))       // Perform the GET request.
                .andDo(print())                          // Print results to console.
                .andExpect(status().isOk())              // ASSERT (status code is 200)

                // ASSERT that the JSON array is present and not empty. We will test GET all endpoints deeper in the
                // future but this is good enough for now.
                .andExpect(jsonPath("$[0]").isNotEmpty());
    }

    //Month Endpoint Code: MockMVC test for successful response.
    @Test
    public void shouldReturnMonthByMonthNumber() throws Exception {
        // ARRANGE
        Month outputMonth = new Month("Jan", 1);


        String outputJson = mapper.writeValueAsString(outputMonth);

        // ACT
        mockMvc.perform(get("/month/1"))
                .andDo(print())
                .andExpect(status().isOk())                     // ASSERT that we got back 200 OK.
                .andExpect(content().json(outputJson));         // ASSERT that what we're expecting is what we got back.
    }

    //Month Endpoint Code: MockMVC test for input out of range.
    @Test
    public void shouldReturnInvalidMonthNumber() throws Exception {
        Month outputMonth = new Month();
        outputMonth.setNumber(15);


        mockMvc.perform(
                        get("/month/15")
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    //Random Month Endpoint Code: MockMVC test for successful response.
    @Test
    public void shouldReturnARandomMonthSuccessfully() throws Exception {
        // ARRANGE and ACT
        mockMvc.perform(get("/randomMonth"))       // Perform the GET request.
                .andDo(print())                          // Print results to console.
                .andExpect(status().isOk());             // ASSERT (status code is 200)

    }
}


