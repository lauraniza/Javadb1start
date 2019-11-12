package com.db1.db1start;

public class Application {

    public Integer soma (Integer numero1, Integer numero2){
        return numero1 + numero2;
    }

    public Integer subtracao (Integer numero1, Integer numero2){
        return numero1 - numero2;
    }

    public Integer multiplicacao (Integer numero1, Integer numero2){
        return numero1 * numero2;
    }

    public Integer divisao (Integer numero1, Integer numero2){
        return numero1 / numero2;
    }

    public Boolean par (Integer numero){
        if(numero % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public Integer maior (Integer valor1, Integer valor2){
        if (valor1 < valor2) {
            return valor2;
        } else {
            return valor1;
        }
    }

    public Integer nImpares (Integer valor) {
        Integer quant = 0, cont;
        for (cont=0; cont < valor; cont++) {
            if (cont % 2 == 1) {
                quant = quant + 1;
            }
        }
        return quant;
    }

    public String maiusculo (String text){
        return text.toUpperCase();
    }

    public String minusculo (String text){
        return text.toLowerCase();
    }
}