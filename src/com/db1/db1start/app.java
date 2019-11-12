package com.db1.db1start;

import java.util.Scanner;

public class app {
    public static Integer soma (Integer valor1, Integer valor2) {
        Integer resultado;
        resultado = valor1 + valor2;
        return resultado;
    }

    public static Integer subtracao (Integer valor1, Integer valor2) {
        Integer resultado;
        resultado = valor1 - valor2;
        return resultado;
    }

    public static String maiusculo (String text) {
        String textMaiusculo = (text.toUpperCase());
        return textMaiusculo;
    }

    public static String minusculo (String text) {
        String textMinusculo = text.toLowerCase();
        return textMinusculo;
    }

    public static Double menorDeDois (Double valor1, Double valor2) {
        Double resultado = null;
        if (valor1 > valor2) {
            resultado = valor2;
        } else if (valor2 > valor1) {
            resultado = valor1;
        }
        return resultado;
    }

    public static Double menorDeTres (Double valor1, Double valor2, Double valor3) {
        Double resultado;
        if (valor1 < valor2 && valor1 < valor3) {
            resultado = valor1;
        } else if (valor2 < valor3) {
            resultado = valor2;
        } else {
            resultado = valor3;
        }
        return resultado;
    }
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número 1:");
        Integer numero1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Informe outro número 2:");
        Integer numero2 = scan.nextInt();
        scan.nextLine();
        System.out.println("A soma entre eles é: " + soma(numero1,numero2));
        System.out.println("Agora informe uma frase:\n");
        String texto = scan.nextLine();
        System.out.println("Frase em maiúsculo: " + maiusculo(texto));
        System.out.println("Frase em maiúsculo: " + minusculo(texto));
        System.out.println("Digite mais três números;\nNúmero 1:");
        Double doubl1 = scan.nextDouble();
        System.out.println("Número 2:");
        Double doubl2 = scan.nextDouble();
        System.out.println("Número 3:");
        Double doubl3 = scan.nextDouble();
        System.out.println("O menor número dentre os dois primeiros informados é o número " + menorDeDois(doubl1,doubl2));
        System.out.println("O menor número dentre os três informados é o número " + menorDeTres(doubl1,doubl2,doubl3));
    }
}
