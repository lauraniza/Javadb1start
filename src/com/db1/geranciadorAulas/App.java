package com.db1.geranciadorAulas;

import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Aluno aluno1= new Aluno("Maioko Cunha","maiko.cunha@db1.com.br");

        Aluno aluno2= new Aluno("João Silva","joao.silva@db1.com.br");

        Professor professor = new Professor("Igor Silva","igor.silva@db1.com.br");

        Materia materia = new Materia();
        materia.nome = "POO";
        materia.descricao = "Abstração, encapsulamento, herança e polimorfismo.";
        materia.cargaHoraria = 10.5;
        materia.quantidadeAulas = 3;
        materia.professor = professor;

        Aula aula1 = new Aula();
        aula1.data = new Date();
        aula1.materia = materia;
        aula1.alunos = new ArrayList<Aluno>();
        aula1.alunos.add(aluno1);
        aula1.alunos.add(aluno2);

        System.out.println(aula1);

    }
}
