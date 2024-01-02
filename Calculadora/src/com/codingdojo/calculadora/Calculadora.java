package com.codingdojo.calculadora;
@SuppressWarnings("serial")
public class Calculadora implements java.io.Serializable {

    private float result;

    public Calculadora() {
        result = 0;
    }

    public float getResult() {
        return result;
    }

    public void performOperation(float operand, char operation) {
        switch (operation) {
            case '+':
                result += operand;
                break;
            case '-':
                result -= operand;
                break;
            case '*':
                result *= operand;
                break;
            case '/':
                if (operand != 0) {
                    result /= operand;
                } else {
                    // Manejo de división por cero
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }
}

