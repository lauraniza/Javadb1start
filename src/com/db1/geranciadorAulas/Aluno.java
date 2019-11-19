package com.db1.geranciadorAulas;

public class Aluno extends Pessoa {
    public Double nota;

    public Aluno(String nome, String email){
        super(nome, email);
    }

    @Override
    public String toString() {
        return super.toString() + "Aluno{" +
                "nota=" + nota +
                '}';
    }


}
