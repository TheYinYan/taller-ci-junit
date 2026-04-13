package com.taller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitarios para la clase Calculator.
 */
@DisplayName("Tests de Calculator")
class CalculatorTest {

    private Calculator calculator;

    /**
     * Se ejecuta antes de cada test.
     * Inicializa una nueva instancia de Calculator.
     */
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // ========== Tests de suma ==========

    @Test
    @DisplayName("Suma de dos números positivos")
    void testAddPositiveNumbers() {
        int result = calculator.add(5, 3);
        assertEquals(8, result, "5 + 3 debe ser 8");
    }

    @Test
    @DisplayName("Suma de números negativos")
    void testAddNegativeNumbers() {
        int result = calculator.add(-5, -3);
        assertEquals(-8, result, "-5 + (-3) debe ser -8");
    }

    @Test
    @DisplayName("Suma de número positivo y negativo")
    void testAddPositiveAndNegative() {
        int result = calculator.add(10, -4);
        assertEquals(6, result, "10 + (-4) debe ser 6");
    }

    @Test
    @DisplayName("Suma con cero")
    void testAddWithZero() {
        int result = calculator.add(5, 0);
        assertEquals(5, result, "5 + 0 debe ser 5");
    }

    // ========== Tests de resta ==========

    @Test
    @DisplayName("Resta de dos números positivos")
    void testSubtractPositiveNumbers() {
        int result = calculator.subtract(10, 3);
        assertEquals(7, result, "10 - 3 debe ser 7");
    }

    @Test
    @DisplayName("Resta que resulta en negativo")
    void testSubtractResultingNegative() {
        int result = calculator.subtract(3, 10);
        assertEquals(-7, result, "3 - 10 debe ser -7");
    }

    // ========== Tests de multiplicación ==========

    @Test
    @DisplayName("Multiplicación de dos números positivos")
    void testMultiplyPositiveNumbers() {
        int result = calculator.multiply(5, 3);
        assertEquals(15, result, "5 * 3 debe ser 15");
    }

    @Test
    @DisplayName("Multiplicación por cero")
    void testMultiplyByZero() {
        int result = calculator.multiply(5, 0);
        assertEquals(0, result, "5 * 0 debe ser 0");
    }

    @Test
    @DisplayName("Multiplicación de números negativos")
    void testMultiplyNegativeNumbers() {
        int result = calculator.multiply(-5, -3);
        assertEquals(15, result, "-5 * -3 debe ser 15");
    }

    // ========== Tests de división ==========

    @Test
    @DisplayName("División de dos números")
    void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result, "10 / 2 debe ser 5");
    }

    @Test
    @DisplayName("División por cero lanza excepción")
    void testDivideByZeroThrowsException() {
        // Verificamos que se lanza la excepción esperada
        ArithmeticException exception = assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(10, 0),
            "Dividir por cero debe lanzar ArithmeticException"
        );

        // Verificamos el mensaje de la excepción
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @Test
    @DisplayName("División con resultado decimal (truncado)")
    void testDivideWithTruncation() {
        int result = calculator.divide(10, 3);
        assertEquals(3, result, "10 / 3 debe ser 3 (truncado)");
    }

    // ========== Tests de isEven ==========

    @Test
    @DisplayName("Número par es detectado correctamente")
    void testIsEvenWithEvenNumber() {
        assertTrue(calculator.isEven(4), "4 debe ser par");
        assertTrue(calculator.isEven(0), "0 debe ser par");
        assertTrue(calculator.isEven(-2), "-2 debe ser par");
    }

    @Test
    @DisplayName("Número impar es detectado correctamente")
    void testIsEvenWithOddNumber() {
        assertFalse(calculator.isEven(3), "3 no debe ser par");
        assertFalse(calculator.isEven(-5), "-5 no debe ser par");
    }

    // ========== Tests de isPositive ==========

    @Test
    @DisplayName("Número positivo es detectado correctamente")
    void testIsPositiveWithPositiveNumber() {
        assertTrue(calculator.isPositive(5), "5 debe ser positivo");
        assertTrue(calculator.isPositive(1), "1 debe ser positivo");
    }

    @Test
    @DisplayName("Número negativo y cero no son positivos")
    void testIsPositiveWithNonPositiveNumber() {
        assertFalse(calculator.isPositive(-5), "-5 no debe ser positivo");
        assertFalse(calculator.isPositive(0), "0 no debe ser positivo");
    }
}