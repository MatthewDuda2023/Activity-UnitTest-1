package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int expected = 4;
        int actual = new Calculator().add(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testAdd() {
        int expected = 6;
        int actual = new Calculator().add(2, 2, 2);
        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        int expected = 8;
        int actual = new Calculator().subtract(10, 2);
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        int expected = 8;
        int actual = new Calculator().multiply(2, 4);
        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        int expected = 4;
        int actual = new Calculator().divide(8, 2);
        assertEquals(expected, actual);
    }
}