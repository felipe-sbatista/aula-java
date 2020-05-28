package com.felipe;

public class Vetor {

    public static void main(String[] args) {
        int idade1 = 30, idade2 = 40, idade3 = 60;
        int idades2[] = {20, 40, 50};
        int idades [] = new int [3];
        int idades4 [] = new int [4];
        idades[0] = 30;
        idades[1] = 40;
        idades[2] = 60;
        for (int i = 0; i < 3; i++) {
            System.out.println(idades[i]);
            System.out.println(idades2[i]);
        }
    }
}
