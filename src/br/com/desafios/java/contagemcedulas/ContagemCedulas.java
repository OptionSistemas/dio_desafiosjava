package br.com.desafios.java.contagemcedulas;

import java.io.IOException;
import java.util.Scanner;

public class ContagemCedulas {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;
        int[] notas = new int[]{100, 50, 20, 10, 5, 2, 1};
        int[] retorno = new int[]{0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < notas.length; i++) {
            retorno[i] = atual / notas[i];
            atual -= notas[i] * retorno[i];
        }

        System.out.println(notasInseridas);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(Integer.toString(retorno[i]) + " nota(s) de R$ "+notas[i]+",00");
        }
    }
}