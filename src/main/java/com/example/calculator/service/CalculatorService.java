package com.example.calculator.service;

import com.example.calculator.exception.IllegalNumberException;

public class CalculatorService {


    public int divide(int num1, int num2) {
        if (num2==0){
            throw new IllegalNumberException ("Нельзя делить на ноль");
        }
        return num1/num2;
    }

    public int plus(int num1, int num2) {
        return num1+num2;
    }

    public int minus(int num1, int num2) {
        return num1-num2;
    }

    public int multiple(int num1, int num2) {
        return num1*num2;
    }
}
