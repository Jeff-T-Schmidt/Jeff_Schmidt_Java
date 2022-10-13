package com.example.Module2Challenge.exceptions;

public class InvalidMonthNumber extends RuntimeException{
    public InvalidMonthNumber() { super(); }

    public InvalidMonthNumber(String msg) { super(msg);}
}
