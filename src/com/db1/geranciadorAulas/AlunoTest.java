package com.db1.geranciadorAulas;

import org.junit.Test;
import org.junit.Assert;

public class AlunoTest {

    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){
        String email = "email.fake@email.com";
        String nome = "Fake";
        Aluno aluno = new Aluno("Fake", "email.fake@email.com");
        Assert.assertEquals(email,aluno.getEmail());
        Assert.assertEquals(nome,aluno.getNome());
    }

    @Test
    public void deveJogarExcepitionComEmailNulo(){
        String nome = "Fake";
        try{
            Aluno aluno = new Aluno(nome, null);
        }catch (CampoNaoNulo naoPodeSerNulo){
            Assert.assertEquals("Email não pode ser nulo.", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExcepitionComNomeNulo(){
        String email = "fake@email.com";
        try{
            Aluno aluno = new Aluno(null, email);
        }catch (CampoNaoNulo naoPodeSerNulo){
            Assert.assertEquals("Nome não pode ser nulo.", naoPodeSerNulo.getMessage());
        }
    }

}
