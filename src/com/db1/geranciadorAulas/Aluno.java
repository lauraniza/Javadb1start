package com.db1.geranciadorAulas;

public class Aluno extends Pessoa {
    public Double nota;

    @Override
    public String toString() {
        return "Aluno{" +
                "nota=" + nota +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
