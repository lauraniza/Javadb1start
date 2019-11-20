package com.db1.geranciadorAulas;

import java.util.Date;
import java.util.List;

public class Aula {

    public Date data;
    public Materia materia;
    public List<Aluno> alunos;

    public Aula(Date data, Materia materia, List<Aluno> alunos) {
        this.data = data;
        this.materia = materia;
        this.alunos = alunos;
    }

    public Date getData() {
        return data;
    }

    public Materia getMateria() {
        return materia;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "data=" + data +
                ", materia=" + materia +
                ", alunos=" + alunos +
                '}';
    }
}