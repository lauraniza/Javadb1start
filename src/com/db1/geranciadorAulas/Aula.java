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

        if(data == null){
            throw new CampoNaoNulo("Data não pode ser nula.");
        }
        if(materia == null){
            throw new CampoNaoNulo("Materia não pode ser nula.");
        }
        if(alunos == null){
            throw new CampoNaoNulo("Alunos não podem ser nulos.");
        }
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
