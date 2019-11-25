package com.db1.cc;

public class App {

    public static void main(String[] args){
       Cliente cliente = new Cliente("84313099972","Paulo Rodolpho Borin Niza");
       Agencia agencia = new Agencia("0773", "0","PR","Mandaguaçu");
       ContaCorrente contaCorrente = new ContaCorrente(agencia, "16556","5","cliente", saldo);

       try{
           contaCorrente.sacar(2000.0);
       }catch (SaldoInsuficienteExcepition e){
           System.out.println(e.getMessage());
           System.out.println("Enviando e-mail para o gerente");
       }
    }
}
