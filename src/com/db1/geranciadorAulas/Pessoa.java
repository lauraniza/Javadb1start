package com.db1.geranciadorAulas;

public abstract class Pessoa {

    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;

        if(email == null){
            throw new CampoNaoNulo("Email não pode ser nulo.");
        }
        if(nome == null){
            throw new CampoNaoNulo("Nome não pode ser nulo.");
        }
    }

    public Pessoa() {}

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
