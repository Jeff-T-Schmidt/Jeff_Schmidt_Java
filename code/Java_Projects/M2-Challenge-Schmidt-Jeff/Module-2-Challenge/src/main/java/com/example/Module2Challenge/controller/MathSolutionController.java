package com.example.Module2Challenge.controller;

import com.example.Module2Challenge.model.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathSolutionController {

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution addNumbers(@RequestBody MathSolution add) {
        try {
            add.setAnswer(add.getOperand1() + add.getOperand2());
            add.setOperations("add");
        } catch (NullPointerException e) {
            throw new NullPointerException("Need both OPERAND1 and OPERAND2!");
        }
        return add;
    }

    @PostMapping("/subtract")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution subtractNumbers(@RequestBody MathSolution subtract) {
        try {

            subtract.setAnswer(subtract.getOperand1() - subtract.getOperand2());
            subtract.setOperations("subtract");
        } catch (NullPointerException e) {
            throw new NullPointerException("Need both OPERAND1 and OPERAND2!");
        }
        return subtract;
    }

    @PostMapping("/divide")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution divideNumbers(@RequestBody MathSolution divide) {

        try {

            divide.setAnswer(divide.getOperand1() / divide.getOperand2());
            divide.setOperations("divide");

        } catch (NullPointerException e) {
            throw new NullPointerException("Need both OPERAND1 and OPERAND2!");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Can't divide by zero dooooooood!");
        }
        return divide;
    }

    @PostMapping("/multiply")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution multiplyNumbers(@RequestBody MathSolution multiply) {
        try {
            multiply.setAnswer(multiply.getOperand1()* multiply.getOperand2());
            multiply.setOperations("multiply");
        } catch (NullPointerException e) {
            throw new NullPointerException("Need both OPERAND1 and OPERAND2!");
        }
        return multiply;
    }
}
