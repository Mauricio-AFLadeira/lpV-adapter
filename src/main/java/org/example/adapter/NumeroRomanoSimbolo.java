package org.example.adapter;

public class NumeroRomanoSimbolo implements INumeroRomano{
    private String simbolo;

    @Override
    public String getNumero() {
        return this.simbolo;
    }

    @Override
    public void setNumero(String simbolo) {
        this.simbolo = simbolo;
    }    
}
