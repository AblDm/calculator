package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
int num1;

    public Integer divide(Integer num1, Integer num2) {
        if (num2==0){
            throw new IllegalNumberException ("Нельзя делить на ноль");
        }
        return num1/num2;
    }

    public int plus(Integer num1, Integer num2) {
        if (num2==null ||num1 == null){
            throw new IllegalNumberException ("Необходимо ввести оба аргумента для работы калькулятора");
        }
        return num1+num2;
    }


    public int minus(Integer num1, Integer num2) {
        if (num2==null ||num1 == null){
            throw new IllegalNumberException ("Необходимо ввести оба аргумента для работы калькулятора");
        }
        return num1-num2;
    }

    public int multiple(Integer num1, Integer num2) {
        if (num2==null ||num1 == null){
            throw new IllegalNumberException ("Необходимо ввести оба аргумента для работы калькулятора");
        }
        return num1*num2;
    }
}
