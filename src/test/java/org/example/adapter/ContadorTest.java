package org.example.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContadorTest {
    @Test
    void deveRetornarConceitoContador() {
        Contador contador = new Contador();
        contador.setnumeroRomano("I");

        assertEquals("I", contador.getnumeroRomano());
    }

    @Test
    void deveRetornarNotaContador() {
        Contador contador = new Contador();
        contador.setnumeroRomano("II");

        assertEquals(2, contador.getValor());
    }

}