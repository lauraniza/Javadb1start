package com.db1.geranciadorAulas;

public abstract class Pessoa {

    public String nome;
    public String email;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
