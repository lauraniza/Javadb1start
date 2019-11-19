package com.db1.geranciadorAulas;

public class Professor extends Pessoa{
    public Double salario;

    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
