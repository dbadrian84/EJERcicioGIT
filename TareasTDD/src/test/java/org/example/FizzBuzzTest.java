package org.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void testearNumero1() {
        String valorInicial = FizzBuzz.returnNumber(1);

        assertEquals("1", valorInicial);
    }

    @Test
    void testearNumero2() {
        String valorInicial = FizzBuzz.returnNumber(2);

        assertEquals("2", valorInicial);
    }

    @Test
    void testearNumero3() {
        String valorInicial = FizzBuzz.returnNumber(3);

        assertEquals("Fizz", valorInicial);
    }

    @Test
    void testearNumero4() {
        String valorInicial = FizzBuzz.returnNumber(4);

        assertEquals("4", valorInicial);
    }

    @Test
    void testearNumero5() {
        String valorInicial = FizzBuzz.returnNumber(5);

        assertEquals("Buzz", valorInicial);
    }

    @Test
    void testearNumero6() {
        String valorInicial = FizzBuzz.returnNumber(6);

        assertEquals("Fizz", valorInicial);
    }

    @Test
    void testearNumero7() {
        String valorInicial = FizzBuzz.returnNumber(7);

        assertEquals("7", valorInicial);
    }

    @Test
    void testearNumero8() {
        String valorInicial = FizzBuzz.returnNumber(8);

        assertEquals("8", valorInicial);
    }

    @Test
    void testearNumero9() {
        String valorInicial = FizzBuzz.returnNumber(9);

        assertEquals("Fizz", valorInicial);
    }

    @Test
    void testearNumero10() {
        String valorInicial = FizzBuzz.returnNumber(10);

        assertEquals("Buzz", valorInicial);
    }

    @Test
    void testearNumero11() {
        String valorInicial = FizzBuzz.returnNumber(11);

        assertEquals("11", valorInicial);
    }

    @Test
    void testearNumero12() {
        String valorInicial = FizzBuzz.returnNumber(12);

        assertEquals("Fizz", valorInicial);
    }

    @Test
    void testearNumero13() {
        String valorInicial = FizzBuzz.returnNumber(13);

        assertEquals("13", valorInicial);
    }

    @Test
    void testearNumero14() {
        String valorInicial = FizzBuzz.returnNumber(14);

        assertEquals("14", valorInicial);
    }

    @Test
    void testearNumero15() {
        String valorInicial = FizzBuzz.returnNumber(15);

        assertEquals("FizzBuzz", valorInicial);
    }

}