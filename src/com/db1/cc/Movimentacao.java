package com.db1.cc;

import java.util.Date;
import java.util.List;

public class Movimentacao {
    private String tipo;
    private Date data;
    private Double valor;
    private List<Movimentacao> movimentacoes;

    public Movimentacao(String tipo, Double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = new Date();
    }

    public String getTipo() {
        return tipo;
    }

    public Date getData() {
        return data;
    }

    public Double getValor() {
        return valor;
    }

    public List<Movimentacao>getExtrato(){
        return this.movimentacoes;
    }
}
