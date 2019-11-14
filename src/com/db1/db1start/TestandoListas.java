package com.db1.db1start;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestandoListas {
    public static void main (String[] argas){
        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Abacaxi");
        frutas.add("Tomate");
        frutas.add("Figo");
        frutas.add("Morango");
        frutas.addAll(Arrays.asList("Jaca", "Caju"));
        System.out.println("Frutas iniciais: " + frutas);

        frutas.add("Banana");
        System.out.println("Mais frutas: " + frutas);

        System.out.println(frutas.indexOf("Banana"));
        System.out.println(frutas.lastIndexOf("Banana"));
        frutas.remove("Banana");
        System.out.println("Sem uma Banana: " + frutas);

        frutas.remove(1);
        System.out.println("Sem index 1: " + frutas);

        frutas.add(1,"Jambo");
        System.out.println("Adicionado no index 1: " + frutas);

        frutas.removeAll(Arrays.asList("Figo","Caju"));
        System.out.println("Removendo vários: " + frutas);

        frutas.removeIf(f -> f.startsWith("J"));
        System.out.println("Removendo 'J'..." + frutas);

        System.out.println("Com for indexado:");
        for(int i = 0; i < frutas.size(); i++){
            System.out.println(frutas.get(i));
        }

        System.out.println("Com for-each:");
        //se precisar do index necessia usar o exemplo anterior
        for(String s: frutas){
            System.out.println(frutas);
        }

       System.out.println("Com for-each com lambda:");
       frutas.forEach(f -> System.out.println(f));
       //outro exemplo, mas agora chamando a função
       //frutas.forEach(System.out::println);
    }
}

