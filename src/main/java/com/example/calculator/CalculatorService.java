package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public Integer checker (Integer num) {
        if (num == null) {
            throw new IllegalNumberException ("Необходимо ввести оба аргумента для работы калькулятора");
        }return num;
    }

    public Integer divide(Integer num1, Integer num2) {
        checker (num1);
        checker (num2);
        if (num2==0){
            throw new IllegalNumberException ("Нельзя делить на ноль");
        }
        return num1/num2;
    }

    public int plus(Integer num1, Integer num2) {
        checker (num1);
        checker (num2);
        return num1+num2;
    }


    public int minus(Integer num1, Integer num2) {
        checker (num1);
        checker (num2);
        return num1-num2;
    }

    public int multiple(Integer num1, Integer num2) {
        checker (num1);
        checker (num2);
        return num1*num2;
    }
}
