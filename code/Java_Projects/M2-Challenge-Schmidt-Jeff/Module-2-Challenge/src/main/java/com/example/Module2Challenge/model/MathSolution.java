package com.example.Module2Challenge.model;

import java.util.Objects;

public class MathSolution {

    private Integer operand1;

    private Integer operand2;

    private Integer answer;

    private String operations;

    public MathSolution() {}

    public Integer getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    public Integer getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathSolution that = (MathSolution) o;
        return Objects.equals(operand1, that.operand1) && Objects.equals(operand2, that.operand2) && Objects.equals(answer, that.answer) && Objects.equals(operations, that.operations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, answer, operations);
    }

    @Override
    public String toString() {
        return "MathSolution{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", answer=" + answer +
                ", operations='" + operations + '\'' +
                '}';
    }
}
