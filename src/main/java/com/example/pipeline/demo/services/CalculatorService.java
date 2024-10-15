package com.example.pipeline.demo.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int adicao(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public double divisao(int a, int b) {
        return (double) a / b;
    }

}
