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

}
