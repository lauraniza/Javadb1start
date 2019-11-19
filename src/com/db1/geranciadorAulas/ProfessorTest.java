package com.db1.geranciadorAulas;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {

    @Test

    public void deveCriarProfessorPorMeioDoConstrutor(){
        String email = "email.fake@email.com";
        String nome = "Fake";
        Professor professor = new Professor("Fake", "email.fake@email.com");
        Assert.assertEquals(email,professor.getEmail());
        Assert.assertEquals(nome,professor.getNome());
    }
}
