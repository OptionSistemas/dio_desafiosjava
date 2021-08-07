package br.com.desafios.java.analisenumeros;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        int valEven = 0;
        int valOdd = 0;
        int valPositive = 0;
        int valNegative = 0;
        double valRead;

        for (int i = 0; i < 5; i++) {
            valRead = read.nextDouble();
            if (valRead > 0) {
                valPositive++;
            }else if (valRead < 0) {
                valNegative++;
            }
            if ((valRead % 2) == 0) {
                valEven++;
            }else {
                valOdd++;
            }
        }
        System.out.println(valEven + " valor(es) par(es)");
        System.out.println(valOdd + " valor(es) impar(es)");
        System.out.println(valPositive + " valor(es) positivo(s)");
        System.out.println(valNegative + " valor(es) negativo(s)");
    }

}