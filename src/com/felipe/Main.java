package com.felipe;

public class Main {

    public static void main(String[] args) {
        System.out.println(3/0);
    }

    public static void printaNome(String nome){
            System.out.println(nome);
    }

    public static void autoIncremento (int valor1){
        // condicao de parada
       if(valor1 == 30){
           return;
       }
        autoIncremento(valor1 + 1);
        System.out.println(valor1);
    }

    public static void autoIncrementoLoop(int valor){
        for (int i = 0; i < 30; i++){
            System.out.println(i);
        }
        while(valor != 30){
            if(valor == 14){
                return;
            }
            System.out.println(valor++);
        }
        System.out.println(valor);
    }
}
