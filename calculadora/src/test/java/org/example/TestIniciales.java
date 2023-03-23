package org.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIniciales {
    @Test
    void devuelve0() {
        Integer valorInicial = operacionesTDD.sumar("");

        assertEquals(0, valorInicial);
    }

    @Test
    void devuelve1() {
        Integer valorInicial = operacionesTDD.sumar("1");

        assertEquals(1, valorInicial);
    }

    @Test
    void devuelve3() {
        Integer valorInicial = operacionesTDD.sumar("1","2");

        assertEquals(3, valorInicial);
    }

    @Test
    void devuelve4() {
        Integer valorInicial = operacionesTDD.sumar("1","1","2");

        assertEquals(4, valorInicial);
    }

    @Test
    void devuelveNegativo1() {
        Integer valorInicial = operacionesTDD.sumar("1","2","");

        assertEquals(-1, valorInicial);
    }

    @Test
    void devuelveNegativo1B() {
        Integer valorInicial = operacionesTDD.sumar("1","-2");

        assertEquals(-1, valorInicial);
    }
}