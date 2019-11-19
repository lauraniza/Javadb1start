package com.db1.geranciadorAulas;

import java.util.List;

public class Materia {

    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Integer quantidadeAulas;
    public Professor professor;

    public Materia(String nome, String descricao, Double cargaHoraria, Integer quantidadeAulas, Professor professor) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeAulas = quantidadeAulas;
        this.professor = professor;
    }

    public Materia() {    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public Integer getQuantidadeAulas() {
        return quantidadeAulas;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", quantidadeAulas=" + quantidadeAulas +
                ", professor=" + professor +
                '}';
    }
}
