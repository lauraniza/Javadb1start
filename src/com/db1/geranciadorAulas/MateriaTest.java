package com.db1.geranciadorAulas;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MateriaTest {

    @Test

    public void deveCriarMateriaPorMeioDoConstrutor (){

        String nome = "Testes";
        String descricao = "Testando gerenciador de aulas";
        Double cargaHoraria = 10.5;
        Integer quantidadeAulas = 3;
        Professor professor = new Professor("Maiko","maiko@email.com");
        Materia materia = new Materia(nome,descricao,cargaHoraria,quantidadeAulas,professor);
        Assert.assertEquals(nome,materia.getNome());
        Assert.assertEquals(descricao,materia.getDescricao());
        Assert.assertEquals(cargaHoraria,materia.getCargaHoraria());
        Assert.assertEquals(quantidadeAulas,materia.getQuantidadeAulas());
        Assert.assertEquals(professor,materia.getProfessor());
    }

    @Test
    public void deveJogarExcepitionComNomeNulo(){
        String descricao = "Aula";
        Double cargaHoraria = 10.5;
        Integer quantidadeAulas = 3;
        Professor professor = new Professor("Maiko","maioko@db1.com.br");
        try{
            Materia materia = new Materia(null,descricao,cargaHoraria,quantidadeAulas,professor);
        }catch (CampoNaoNulo naoPodeSerNulo){
            Assert.assertEquals("Nome não pode ser nulo.", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExcepitionComDescricaoNulo(){
        String nome = "Fake";
        Double cargaHoraria = 10.5;
        Integer quantidadeAulas = 3;
        Professor professor = new Professor("Maiko","maioko@db1.com.br");
        try{
            Materia materia = new Materia(nome,null,cargaHoraria,quantidadeAulas,professor);
        }catch (CampoNaoNulo naoPodeSerNulo){
            Assert.assertEquals("Descrição não pode ser nula.", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExcepitionComCargaHorariaNulo(){
        String nome = "Fake";
        String descricao = "Aula";
        Integer quantidadeAulas = 3;
        Professor professor = new Professor("Maiko","maioko@db1.com.br");
        try{
            Materia materia = new Materia(nome,descricao,null,quantidadeAulas,professor);
        }catch (CampoNaoNulo naoPodeSerNulo){
            Assert.assertEquals("Carga horária não pode ser nula.", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExcepitionComQuantidadeAulasNulo(){
        String nome = "Fake";
        String descricao = "Aula";
        Double cargaHoraria = 10.5;
        Professor professor = new Professor("Maiko","maioko@db1.com.br");
        try{
            Materia materia = new Materia(nome,descricao,cargaHoraria,null,professor);
        }catch (CampoNaoNulo naoPodeSerNulo){
            Assert.assertEquals("Quantidade de aulas não pode ser nula.", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExcepitionComProfessorNulo(){
        String nome = "Fake";
        String descricao = "Aula";
        Double cargaHoraria = 10.5;
        Integer quantidadeAulas = 3;
        try{
            Materia materia = new Materia(nome,descricao,cargaHoraria,quantidadeAulas,null);
        }catch (CampoNaoNulo naoPodeSerNulo){
            Assert.assertEquals("Professor não pode ser nulo.", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveTrocarDeProfessor() {
        Professor professor1 = new Professor("igor.silva@db1.com.br", "Igor");
        Professor professor2 = new Professor("professor@db1.com.br", "Professor");

        Materia materia = new Materia("Java", "POO", 10.5, 3, professor1);

        Assert.assertEquals(professor1, materia.getProfessor());

        materia.trocaProfessor(professor2);

        Assert.assertEquals(professor2, materia.getProfessor());
    }
}
