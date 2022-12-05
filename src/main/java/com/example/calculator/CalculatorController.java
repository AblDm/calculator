package com.example.calculator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @ExceptionHandler(value =  IllegalArgumentException.class)
    public ResponseEntity<String> IllegalNumberHandler (IllegalArgumentException e){
        return ResponseEntity.badRequest ().body (e.getMessage ());
    }

    @GetMapping("/")
    public String hello() {return "Hello, username!"; }

    @GetMapping("/plus")
    public String plus (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        int result = calculatorService.plus (num1, num2);
        return String.format ("%d + %d = %d", num1, num2, result);
    }

    @GetMapping("/minus")
    public String minus (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        int result = calculatorService.minus (num1, num2);
        return String.format ("%d - %d = %d", num1, num2, result);
    }

    @GetMapping("/multiple")
    public String multiple (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        int result = calculatorService.multiple (num1, num2);
        return String.format ("%d * %d = %d", num1, num2, result);
    }

    @GetMapping("/divide")
    public String divide (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        int result = calculatorService.divide (num1, num2);
        return String.format ("%d / %d = %d", num1, num2, result);
    }

}
