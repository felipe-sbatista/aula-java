package com.felipe;

import com.felipe.models.Calculadora;
import com.felipe.models.Contato;

public class Obj {

    public static void main(String[] args) {
        String nome; int fone= 0; byte[] foto;
        String nome2; int fone2; byte[] foto2;


        Contato joao = new Contato("felipe", "ffdfd");
        Contato felipe = new Contato("felipe", "443435", 549534987);
        Contato tarcisio = new Contato("tarcisio", "fdfdf", 47398437);

        System.out.println(felipe.fone);
        System.out.println(tarcisio.nome);

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.soma(20, 59);
        calculadora.ligar();
        System.out.println(resultado);

    }
}
