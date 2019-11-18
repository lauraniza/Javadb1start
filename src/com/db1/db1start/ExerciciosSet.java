package com.db1.db1start;
//Em um set com números inteiros encontre o menor, o maior, a soma e a média

import java.lang.reflect.Array;
import java.util.*;

public class ExerciciosSet {
    public static void main(String[] args) {
//Crie um set com uma lista de nomes com 5 nomes sendo adicionados mais de uma vez
        List<String> listaNomes = new ArrayList<>();
        listaNomes.addAll(Arrays.asList("Thiago","Laura","Ronaldo","Alysson","Laura","Robson","Thiago"));
        Set<String> nomes = new HashSet<>(listaNomes);
        System.out.println(nomes);

//Remova os nomes "Suzete" OU começados com "F" ou terminados em "naldo"
//        nomes.remove("Suzete");
//        nomes.remove("naldo");
//        nomes.remove("F");
//        System.out.println(nomes);

//Encontre no set "Suzana" (ou não...), Se existir exiba com todas letras maiúsculas

    }
}
