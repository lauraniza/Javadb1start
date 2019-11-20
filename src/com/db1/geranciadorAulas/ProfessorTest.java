package com.db1.geranciadorAulas;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {

    @Test

    public void deveCriarProfessorPorMeioDoConstrutor() {
        String email = "email.fake@email.com";
        String nome = "Fake";
        Professor professor = new Professor("Fake", "email.fake@email.com");
        Assert.assertEquals(email, professor.getEmail());
        Assert.assertEquals(nome, professor.getNome());
    }

    @Test
    public void deveJogarExcepitionComEmailNulo() {
        String nome = "Fake";
        try {
            Professor professor = new Professor(nome, null);
        } catch (CampoNaoNulo naoPodeSerNulo) {
            Assert.assertEquals("Email não pode ser nulo.", naoPodeSerNulo.getMessage());
        }
    }

        @Test
        public void deveJogarExcepitionComNomeNulo() {
            String email = "fake@email.com";
            try {
                Professor professor = new Professor(null, email);
            } catch (CampoNaoNulo naoPodeSerNulo) {
                Assert.assertEquals("Nome não pode ser nulo.", naoPodeSerNulo.getMessage());
            }
        }
}

