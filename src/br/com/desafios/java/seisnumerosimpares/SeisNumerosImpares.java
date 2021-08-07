package br.com.desafios.java.seisnumerosimpares;

import java.io.IOException;
import java.util.Scanner;

public class SeisNumerosImpares {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;
        x = x % 2 == 0 ? x + 1 : x;

        while (cont < 6) {
            System.out.println(x);
            x = x + 2;
            cont++;
        }
    }

}