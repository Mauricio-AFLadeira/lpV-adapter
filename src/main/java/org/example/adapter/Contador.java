package org.example.adapter;

public class Contador {
    INumeroRomano numeroRomano;
    NumeroRomanoAdapter persistencia;

    public Contador() {
        numeroRomano = new NumeroRomanoSimbolo();
        persistencia = new NumeroRomanoAdapter(numeroRomano);
    }

    public void setnumeroRomano(String simbolo) {
        numeroRomano.setNumero(simbolo);
        persistencia.salvarNumero();
    }

    public String getnumeroRomano() {
        return persistencia.recuperarNumero();
    }

    // Método apenas para mostrar que está convertendo simbolo para nota através do adaptador
    public float getValor() {
        return persistencia.getValor();
    }
}
