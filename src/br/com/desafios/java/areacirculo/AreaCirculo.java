package br.com.desafios.java.areacirculo;

import java.util.Scanner;
import java.math.BigDecimal;

public class AreaCirculo {
    public static void main(String[] args) {
        BigDecimal area, raio;
        Scanner scan = new Scanner(System.in);
        raio = scan.nextBigDecimal();
        area = raio.pow(2).multiply(new BigDecimal("3.14159"));
        System.out.printf("A=%.4f\n", area);
    }
}