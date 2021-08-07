package br.com.desafios.java.encaixanaoencaixa;

import java.io.IOException;
import java.util.Scanner;

public class EncaixaNaoEncaixa {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < N; i++) {
            String[] valores = leitor.nextLine().split(" ");
            if (valores[0].endsWith(valores[1]))
                System.out.println("encaixa");
            else
                System.out.println("nao encaixa");
        }
    }

}