package com.db1.db1start;

import java.util.Scanner;

public class app {
    public static void ex1Numero(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        Integer numero1 = Integer.valueOf(scan.next());
        System.out.println("Digite outro número:");
        Integer numero2 = Integer.valueOf(scan.next());
        System.out.println(numero1 + numero2);
    }

    public static void ex2Numero(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        Integer numero1 = Integer.valueOf(scan.next());
        System.out.println("Digite outro número:");
        Integer numero2 = Integer.valueOf(scan.next());
        System.out.println(numero1 - numero2);
    }

    public static void ex1String(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Informe uma frase em caracteres minúsculos:\n");
        String text = scan.nextLine();
        System.out.println(text.toUpperCase());
    }

    public static void ex2String(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Informe uma frasecom caracteres maiúsculo e minúsculos:\n");
        String text = scan.nextLine();
        System.out.println(text.toLowerCase());
    }

    public static void ex1Matematica(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor:");
        Double valor1 = scan.nextDouble();
        System.out.println("Digite outro valor:");
        Double valor2 = scan.nextDouble();
        if (valor1 > valor2) {
            System.out.println("O menor valor é o 2");
        } else if (valor2 > valor1) {
            System.out.println("O menor valor é o 1");
        }
    }

    public static void ex2Matematica(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor:");
        Double valor1 = scan.nextDouble();
        System.out.println("Digite outro valor:");
        Double valor2 = scan.nextDouble();
        System.out.println("Digite outro valor:");
        Double valor3 = scan.nextDouble();
        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println("Menor valor é o 1");
        } else if (valor2 < valor3) {
            System.out.println("Menor valor é o 2");
        } else {
            System.out.println("Menor valor é o 3");
        }
    }
}
