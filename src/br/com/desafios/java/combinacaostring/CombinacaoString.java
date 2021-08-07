package br.com.desafios.java.combinacaostring;

import java.util.Scanner;

public class CombinacaoString {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = Integer.parseInt(leitor.nextLine());
        String restante = "";
        for (int i = 0; i < N; i++) {
            StringBuilder resultado = new StringBuilder();
            String[] caracteres = leitor.nextLine().split(" ");
            int stringSmaller = Math.min(caracteres[0].length(), caracteres[1].length());
            restante = caracteres[0].length() == stringSmaller ?
                    caracteres[1].substring(stringSmaller) :
                    caracteres[0].substring(stringSmaller);

            for (int k = 0; k < stringSmaller; k++) {
                resultado.append(caracteres[0].charAt(k));
                resultado.append(caracteres[1].charAt(k));
            }
            resultado.append(restante);
            System.out.println(resultado);
        }
    }
}
