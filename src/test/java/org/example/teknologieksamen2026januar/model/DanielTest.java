package org.example.teknologieksamen2026januar.model;

import org.junit.jupiter.api.Disabled;
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

    @Test
    @Disabled
    void testSetAgeFailingExample() {
        // 1. Arrange: Opret objektet
        Daniel daniel = new Daniel("Daniel", 25);

        // 2. Act: Vi ændrer alderen til 30
        int nyAlder = 30;
        daniel.setAge(nyAlder);

        // 3. Assert: Vi laver en bevidst fejl
        assertEquals(25, daniel.getAge(), "FEJL-DEMO: Forventede den oprindelige alder (25), men setteren har ændret den til 30.");
    }
}