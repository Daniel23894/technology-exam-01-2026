package org.example.teknologieksamen2026januar.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DanielTest {

    @Test
    void testDanielConstructorAndGetters() {
        // 1. opretter et objekt med specifikke værdier
        String forventetNavn = "Daniel";
        int forventetAlder = 25;
        Daniel daniel = new Daniel(forventetNavn, forventetAlder);

        // 2. Tjekker om vores getters returnerer det rigtige
        assertEquals(forventetNavn, daniel.getName(), "Navnet skal matche constructoren");
        assertEquals(forventetAlder, daniel.getAge(), "Alderen skal matche constructoren");
    }

}