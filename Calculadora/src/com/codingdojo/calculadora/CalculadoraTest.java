package com.codingdojo.calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.performOperation(10.5f, ' ');
        calculadora.performOperation(5.2f, '+');
        calculadora.performOperation(10f, '*');
        
        float result = calculadora.getResult();
        System.out.println("Resultado: " + result); // Debería imprimir "Resultado: 62.5"
    }
}
