package com.taller;

/**
 * Calculadora simple para demostrar tests unitarios.
 */
public class Calculator {

    /**
     * Suma dos números enteros.
     *
     * @param a primer número
     * @param b segundo número
     * @return la suma de a y b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     *
     * @param a número del que se resta
     * @param b número a restar
     * @return la diferencia entre a y b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param a primer número
     * @param b segundo número
     * @return el producto de a y b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     *
     * @param a dividendo
     * @param b divisor
     * @return el cociente de a entre b
     * @throws ArithmeticException si b es 0
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    /**
     * Verifica si un número es par.
     *
     * @param n número a verificar
     * @return true si n es par, false en caso contrario
     */
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Verifica si un número es positivo.
     *
     * @param n número a verificar
     * @return true si n es mayor que 0, false en caso contrario
     */
    public boolean isPositive(int n) {
        return n > 0;
    }
}