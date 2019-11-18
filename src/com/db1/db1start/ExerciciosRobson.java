package com.db1.db1start;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ExerciciosRobson {

    public static void main(){

    }

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
    public static void inserir3excluirPosicao2(){
        List<String> cidades = new ArrayList<>();
        cidades.addAll(Arrays.asList("Maringá","Marialva","Mandaguaçu"));
        cidades.remove(1);
    }

    //Método que imprima a lista de cores do primeiro método
    public static void imprimirCores (){
        coresFavoritas().forEach(System.out::println);
}

    //Método que imprima as cores do primeiro método em ordem alfabética
    public static void coresOrdemAlfabetica (){
        List<String> cores = coresFavoritas();
        Collections.sort(cores);
        cores().forEach(System.out::println);
    }

    //Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida
    public static void removerUmaCor (){
        List<String> coresRemocao = coresFavoritas();
        coresRemocao.remove("Amarelo");
    }

    //Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)
    public static void coresDecrescente (){
        List<String> cores = coresFavoritas();
        Collections.sort(cores, Collections.reverseOrder());
        cores().forEach(System.out::println);
    }

    //Método que receba uma lista de números e retorne um mapa com listas de números pares e impares
    public Map<String, List<Integer>> SepararParesImpares (List<Integer> numeros){
        Map<String, List<Integer>> mapa = new HashMap<>();
        mapa.put("PAR", new ArrayList<>());
        mapa.put("ÍMPAR", new ArrayList<>());
        numeros.forEach(n ->{
            String chave = n % 2 == 0 ? "PAR" : "IMPAR";
            mapa.get(chave).add(n);
        });
        return mapa;
    }
}
