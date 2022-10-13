package com.example.Module2Challenge.exceptions;

public class OutOfRangeException extends RuntimeException{
    public OutOfRangeException() {
        super();
    }

    public OutOfRangeException(String msg) {
        super(msg);
    }
}
