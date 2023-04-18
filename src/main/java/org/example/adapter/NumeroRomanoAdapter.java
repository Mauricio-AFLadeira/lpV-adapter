package org.example.adapter;

public class NumeroRomanoAdapter extends NumeroRomanoValor{
    private INumeroRomano numeroRomanoSimbolo;

    public NumeroRomanoAdapter(INumeroRomano numeroRomanoSimbolo) {
        this.numeroRomanoSimbolo = numeroRomanoSimbolo;
    }

    public String recuperarNumero() {
        if (this.getValor() == 1)
            numeroRomanoSimbolo.setNumero("I");
        else
        if (this.getValor() == 2)
            numeroRomanoSimbolo.setNumero("II");
        else
        if (this.getValor() == 3)
            numeroRomanoSimbolo.setNumero("III");
        if (this.getValor() == 4)
            numeroRomanoSimbolo.setNumero("IV");
        return numeroRomanoSimbolo.getNumero();
    }

    public void salvarNumero() {
        if (numeroRomanoSimbolo.getNumero().equals("I"))
            this.setValor(1);
        else
        if (numeroRomanoSimbolo.getNumero().equals("II"))
            this.setValor(2);
        else
        if (numeroRomanoSimbolo.getNumero().equals("III"))
            this.setValor(3);
        if (numeroRomanoSimbolo.getNumero().equals("IV"))
            this.setValor(4);
    }
}
