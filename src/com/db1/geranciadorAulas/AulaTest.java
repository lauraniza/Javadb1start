package com.db1.geranciadorAulas;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AulaTest {

    @Test
    public void deveCriarAulaPorMeioDoConstrutor(){
        Date data = new Date();
        Professor professor = new Professor("Fake","fake@email.com");
        Materia materia = new Materia("Maiko","POO",10.5,3,professor);
        List<Aluno> alunos = new ArrayList<>();
        Aula aula = new Aula(data,materia,alunos);
        Assert.assertEquals(data,aula.getData());
        Assert.assertEquals(alunos,aula.getAlunos());
        Assert.assertEquals(materia,aula.getMateria());
    }

    @Test
    public void deveJogarExcepitionComDataNulo(){
            Materia materia = new Materia();
            List<Aluno> alunos = new ArrayList<>();
            try{
                Aula aula = new Aula(null,materia,alunos);
            }catch (CampoNaoNulo naoPodeSerNulo){
                Assert.assertEquals("Data não pode ser nula.", naoPodeSerNulo.getMessage());
            }
       }

    @Test
    public void deveJogarExcepitionComMateriaNulo(){
        Date data = new Date();
        List<Aluno> alunos = new ArrayList<>();
        try{
            Aula aula = new Aula(data,null,alunos);
        }catch (CampoNaoNulo naoPodeSerNulo){
            Assert.assertEquals("Materia não pode ser nula.", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExcepitionComAlunosNulo(){
        Date data = new Date();
        Materia materia = new Materia();
        try{
            Aula aula = new Aula(data,materia,null);
        }catch (CampoNaoNulo naoPodeSerNulo){
            Assert.assertEquals("Alunos não podem ser nulos.", naoPodeSerNulo.getMessage());
        }
    }
}

