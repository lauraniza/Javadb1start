package com.db1.geranciadorAulas;

import org.junit.Assert;
import org.junit.Test;

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
}
