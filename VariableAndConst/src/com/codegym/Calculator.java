package com.codegym;

public class Calculator {

    static final char ADD = '+';
    static final char SUB = '-';
    static final char MUL = '*';
    static final char DIV = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADD:
                return firstOperand + secondOperand;
            case SUB:
                return firstOperand - secondOperand;
            case MUL:
                return firstOperand * secondOperand;
            case DIV:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}