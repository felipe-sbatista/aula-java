package com.felipe.models;

public class Contato {
    public String nome;
    public String CPF;
    public int fone;

    public Contato(String nome, String cpf){
        this.nome = nome;
        this.CPF = cpf;
    }
    public Contato(String nome, String CPF, int fone){
        this.nome = nome;
        this.fone = fone;
        this.CPF = CPF;
    }

// esse metodo faz uma ligacao
    public void ligar(){
        System.out.println("estou ligando");
    }
    public void enviarSMS(){
        System.out.println("estou enviando SMS");
    }
}
