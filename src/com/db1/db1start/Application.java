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
        return valor % 2 == 0 ? valor/2 : (valor+1)/2;
    }

    public String maiusculo(String text){
        return text.toUpperCase();
    }

    public String minusculo (String text){
        return text.toLowerCase();
    }

    public Integer quantidadeLetras (String text) {
        return text.replaceAll("[0-9]","").length();
    }

    public Integer quantLetras (String text) {
        return (text.replaceAll("[0-9]","").trim()).length();
    }

    public String semEspacos (String text) {
        return text.trim();
    }

    public String primeiras4letras (String text){
        return text.substring(0,4);
    }

    public String apos2primeiras (String text){
        return text.substring(2);
    }

    public String ultimas4 (String text){
        return text.substring(13);
    }

    public String alunoNoNome (String text){
        return "aluna" + text.substring(5);
    }

    public String[] separacao (String text){
        return text.split(", ");
    }

    /*public Integer numVogais (String text){
        String vogais = "AEIOUaeiou";
        for(Integer cont=0; cont < text.length(); cont++){
            if(text.charAt(cont) == )
        }
    }*/

}