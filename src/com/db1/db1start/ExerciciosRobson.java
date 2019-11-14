package com.db1.db1start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExerciciosRobson {

    //Método que retorne os nomes das cores que você mais gosta
    public List<String> coresFavoritas (){
        List<String> cores = new ArrayList<>();
        cores.addAll(Arrays.asList("Vermelho","Laranja","Amarelo","Azul"));
        return cores;
    }

    //Método que dado uma lista retorne a quantidade de itens
    public Integer quantidadeItens (){
        return coresFavoritas().size();
    }

    //Método que receba 3 String, adicione todos em uma lista e remova a segunda posição
    public List<String> inserir3excluirPosicao2(){
        List<String> cidades = new ArrayList<>();
        cidades.addAll(Arrays.asList("Maringá","Marialva","Mandaguaçu"));
        cidades.remove(1);
        return cidades;
    }

    //Método que imprima a lista de cores do primeiro método
    public void imprimirCores (){
        System.out.println(coresFavoritas());
}

    //Método que imprima as cores do primeiro método em ordem alfabética
    public List<String> coresOrdemAlfabetica (){
        return coresFavoritas(Collections.sort();
    }

    //Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida
    public List<String> removerUmaCor (){
        List<String> coresRemocao = new ArrayList<>();
        coresRemocao = coresFavoritas();
        coresRemocao.remove("Amarelo");
        return coresRemocao;
    }

    //Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)
    public List<String> coresDecrescente (){

    }

    //Método que receba uma lista de números e retorne um mapa com listas de números pares e impares
}
