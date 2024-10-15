package com.example.pipeline.demo.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTest {

    @Autowired
    private CalculatorService calculatorService;
    @Test
    void somarTeste() {
        int resultadoEsperado = 8;

        assertEquals(calculatorService.adicao(5, 3), resultadoEsperado);
    }

    @Test
    void subtrairTeste() {
        int resultadoEsperado = 12;

        assertEquals(calculatorService.subtracao(25, 13), resultadoEsperado);
    }

    @Test
    void multiplicarTeste() {
        int resultadoEsperado = 144;

        assertEquals(calculatorService.multiplicacao(12, 12), resultadoEsperado);
    }

    @Test
    void divisaoTeste() {
        double resultadoEsperado = 2.0;

       assertEquals(calculatorService.divisao(20, 10), resultadoEsperado);
    }
}
