package com.example.Module2Challenge.controller;

import com.example.Module2Challenge.model.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class MathSolutionControllerTest {

    // Wiring in the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    //Add Endpoint Code: MockMVC test for successful response.
    @Test
    public void shouldReturnSuccessfulAdditionResponse() throws Exception {
        MathSolution inputNumbers = new MathSolution();
        inputNumbers.setOperand1(1);
        inputNumbers.setOperand2(2);
        inputNumbers.setOperations("add");
        inputNumbers.setAnswer(inputNumbers.getOperand1()+ inputNumbers.getOperand2());

        String inputJson = mapper.writeValueAsString(inputNumbers);

        MathSolution outputNumbers = new MathSolution();
        outputNumbers.setOperand1(1);
        outputNumbers.setOperand2(2);
        outputNumbers.setOperations("add");
        outputNumbers.setAnswer(outputNumbers.getOperand1()+ outputNumbers.getOperand2());

        String outputJson = mapper.writeValueAsString(outputNumbers);

        mockMvc.perform(
                        post("/add")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(content().json(outputJson));
    }
    //Add Endpoint Code: MockMVC test for invalid response.
    @Test
    public void shouldReturnNullPointerExceptionInAddRoute() throws Exception {
        MathSolution inputNumbers = new MathSolution();
        inputNumbers.setOperand1(1);

        String inputJson = mapper.writeValueAsString(inputNumbers);

        mockMvc.perform(
                        post("/add")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isUnprocessableEntity());

    }
    //Subtract Endpoint Code: MockMVC test for successful response.
    @Test
    public void shouldReturnSuccessfulSubtractionResponse() throws Exception {
        MathSolution inputNumbers = new MathSolution();
        inputNumbers.setOperand1(3);
        inputNumbers.setOperand2(2);
        inputNumbers.setOperations("subtract");
        inputNumbers.setAnswer(inputNumbers.getOperand1()- inputNumbers.getOperand2());

        String inputJson = mapper.writeValueAsString(inputNumbers);

        MathSolution outputNumbers = new MathSolution();
        outputNumbers.setOperand1(3);
        outputNumbers.setOperand2(2);
        outputNumbers.setOperations("subtract");
        outputNumbers.setAnswer(outputNumbers.getOperand1()- outputNumbers.getOperand2());

        String outputJson = mapper.writeValueAsString(outputNumbers);

        mockMvc.perform(
                        post("/subtract")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(content().json(outputJson));
    }
    //Subtract Endpoint Code: MockMVC test for invalid response.
    @Test
    public void shouldReturnNullPointerExceptionInSubtractRoute() throws Exception {
        MathSolution inputNumbers = new MathSolution();
        inputNumbers.setOperand1(1);

        String inputJson = mapper.writeValueAsString(inputNumbers);

        mockMvc.perform(
                        post("/subtract")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isUnprocessableEntity());

    }
    //Divide Endpoint Code: MockMVC test for successful response.
    @Test
    public void shouldReturnSuccessfulDivisionResponse() throws Exception {
        MathSolution inputNumbers = new MathSolution();
        inputNumbers.setOperand1(4);
        inputNumbers.setOperand2(2);
        inputNumbers.setOperations("divide");
        inputNumbers.setAnswer(inputNumbers.getOperand1() / inputNumbers.getOperand2());

        String inputJson = mapper.writeValueAsString(inputNumbers);

        MathSolution outputNumbers = new MathSolution();
        outputNumbers.setOperand1(4);
        outputNumbers.setOperand2(2);
        outputNumbers.setOperations("divide");
        outputNumbers.setAnswer(outputNumbers.getOperand1() / outputNumbers.getOperand2());

        String outputJson = mapper.writeValueAsString(outputNumbers);

        mockMvc.perform(
                        post("/divide")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(content().json(outputJson));
    }
    //Divide Endpoint Code: MockMVC test for invalid response.
    @Test
    public void shouldReturnNullPointerExceptionInDivideRoute() throws Exception {
        MathSolution inputNumbers = new MathSolution();
        inputNumbers.setOperand1(1);

        String inputJson = mapper.writeValueAsString(inputNumbers);

        mockMvc.perform(
                        post("/divide")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isUnprocessableEntity());

    }
    //Divide Endpoint Code: MockMVC test for dividing by zero.
    @Test
    public void shouldReturnAnArithmeticExceptionIfDividingByZero() throws Exception {
        MathSolution inputNumbers = new MathSolution();
        inputNumbers.setOperand1(10);
        inputNumbers.setOperand2(0);
        inputNumbers.setOperations("divide");

        String inputJson = mapper.writeValueAsString(inputNumbers);

        mockMvc.perform(
                        post("/divide")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isUnprocessableEntity());

    }
    //Multiply Endpoint Code: MockMVC test for successful response.
    @Test
    public void shouldReturnSuccessfulMultiplicationResponse() throws Exception {
        MathSolution inputNumbers = new MathSolution();
        inputNumbers.setOperand1(4);
        inputNumbers.setOperand2(2);
        inputNumbers.setOperations("multiply");
        inputNumbers.setAnswer(inputNumbers.getOperand1() * inputNumbers.getOperand2());

        String inputJson = mapper.writeValueAsString(inputNumbers);

        MathSolution outputNumbers = new MathSolution();
        outputNumbers.setOperand1(4);
        outputNumbers.setOperand2(2);
        outputNumbers.setOperations("multiply");
        outputNumbers.setAnswer(outputNumbers.getOperand1() * outputNumbers.getOperand2());

        String outputJson = mapper.writeValueAsString(outputNumbers);

        mockMvc.perform(
                        post("/multiply")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(content().json(outputJson));
    }
    //Add Endpoint Code: MockMVC test for invalid response.
    @Test
    public void shouldReturnNullPointerExceptionInMultiplyRoute() throws Exception {
        MathSolution inputNumbers = new MathSolution();
        inputNumbers.setOperand1(1);

        String inputJson = mapper.writeValueAsString(inputNumbers);

        mockMvc.perform(
                        post("/multiply")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isUnprocessableEntity());

    }
}