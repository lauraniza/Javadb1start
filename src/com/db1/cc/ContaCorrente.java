package com.db1.cc;

import java.util.List;

public class ContaCorrente {
    private Agencia agencia;
    private String numero;
    private String digito;
    private Cliente cliente;
    private Double saldo;
    private List<Movimentacao> movimentacao;

    public ContaCorrente(Agencia agencia, String numero, String digito, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.digito = digito;
        this.cliente = cliente;
    }

    public void depositar (Double valor){
        if(valor==null){
            throw new RuntimeException("");
        }

        if(valor<=0.0){
            throw new RuntimeException("");
        }

        this.saldo+=valor;
        this.movimentacao.add(new Movimentacao("ENTRADA",valor));
    }

    public void sacar (Double valor){
        if(valor==null){
            throw new RuntimeException("");
        }

        if(valor<=0.0){
            throw new RuntimeException("");
        }

        if(valor>saldo){
            throw new RuntimeException("");
        }

        this.saldo-=valor;
        this.movimentacao.add(new Movimentacao("SAÍDA",valor));
    }

    public void tranferir ( Double valor){
        if(valor==null){
            throw new RuntimeException("");
        }

        if(valor<=0.0){
            throw new RuntimeException("");
        }

        this.saldo-=valor;
        this.movimentacao.add(new Movimentacao("SAÍDA", valor));
    }
}
