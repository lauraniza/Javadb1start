package com.db1.db1start;

import java.util.Scanner;

public class app {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        //exercicio 1 de inteiro
        Integer numero1, numero2;
        System.out.println("Digite um número:");
        numero1 = scan.next();
        System.out.println("Digite outro número:");
        numero2 = scan.next();
        System.out.println(numero1 + numero2);

        //exercicio 2 de inteiro
        System.out.println("Digite um número:");
        numero1 = scan.next();
        System.out.println("Digite outro número:");
        numero2 = scan.next();
        System.out.println(numero1 - numero2);

        //exercicio 1 de string
        System.out.printf("Informe uma frase em caracteres minúsculos:\n");
        String text = scan.nextLine();
        System.out.println(text.toUpperCase());

        //exercicio 2 string
        System.out.printf("Informe uma frasecom caracteres maiúsculo e minúsculos:\n");
        text = scan.nextLine();
        System.out.println(text.toLowerCase());

        //exercicio 1 matematica
        Double numero01, numero02;
        System.out.println("Digite um número real:");
        numero01 = scan.next();
        System.out.println("Digite outro número real:");
        numero02 = scan.next();
        if(numero01 > numero02) System.out.println("O menor número é ", numero02);
        else if (numero02 > numero01){
            System.out.println("O menor número é ", numero01);
        }else {
            System.out.println("Os números tem o mesmo valor.");
        }

        //exercicio 2 de matematica
        System.out.println("Digite um número real:");
        numero01 = scan.next();
        System.out.println("Digite outro número real:");
        numero02 = scan.next();
        System.out.println("Digite outro número real:");
        Double numero03;
        numero03= scan.next();
  }
}
