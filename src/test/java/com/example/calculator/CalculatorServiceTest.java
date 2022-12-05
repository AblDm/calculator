package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService ();

    @ParameterizedTest
    @MethodSource ("plusTestSuites")
    public void plusTest (int num1,int num2 ,int result){
        assertEquals (result, calculatorService.plus (num1, num2));
    }

    @ParameterizedTest
    @MethodSource ("minusTestSuites")
    public void minusTest (int num1,int num2 ,int result){
        assertEquals (result, calculatorService.minus (num1, num2));
    }

    @ParameterizedTest
    @MethodSource ("multipleTestSuites")
    public void multipleTest (int num1,int num2 ,int result){
        assertEquals (result, calculatorService.multiple (num1, num2));
    }

    @ParameterizedTest
    @MethodSource ("divideTestSuites")
    public void divideTest (int num1,int num2 ,int result){
        assertEquals (result, calculatorService.divide (num1, num2));
    }

    @Test
    public void checkerThrowExceptions () {
        assertThrows (IllegalArgumentException.class, () ->{
            calculatorService.checker (null);
        });
    }


    @Test
    public void divideByZeroThrowExceptions () {
        assertThrows (IllegalArgumentException.class, () ->{
            calculatorService.divide (1,0);
        });
    }

    public static List <Arguments> plusTestSuites() {
        return List.of (
                Arguments.of (8,6,14),
                Arguments.of (9,9,18),
                Arguments.of (-6,6,0),
                Arguments.of (3,11,14)
        );
    }


  public static List <Arguments> minusTestSuites() {
        return List.of (
                Arguments.of (8,6,2),
                Arguments.of (9,9,0),
                Arguments.of (-6,6,-12),
                Arguments.of (3,11,-8)
        );
    }

  public static List <Arguments> divideTestSuites() {
        return List.of (
                Arguments.of (8,2,4),
                Arguments.of (9,9,1),
                Arguments.of (-6,6,-1),
                Arguments.of (33,11,3)
        );
    }

  public static List <Arguments> multipleTestSuites() {
        return List.of (
                Arguments.of (8,6,48),
                Arguments.of (9,9,81),
                Arguments.of (-6,6,-36),
                Arguments.of (3,11,33)
        );
    }

}
