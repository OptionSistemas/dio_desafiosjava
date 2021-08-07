package br.com.desafios.java.numerospositivos;

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtde = 0;
        for (int i = 0; i < 6; i++) {
            double num = sc.nextDouble();
            if (num > 0) {
                qtde++;
            }
        }
        System.out.println(qtde + " valores positivos");
    }
}
