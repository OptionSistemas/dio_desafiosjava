package br.com.desafios.java.corridatartaruga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CorridaTartaruga {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {
            n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String s[] = str.split(" ");
            int[] arrayInt = Arrays.asList(s).stream().mapToInt(Integer::parseInt).toArray();
            int max = Arrays.stream(arrayInt).max().getAsInt();
            int m = (max >= 20) ? 3 : (max < 10) ? 1 : 2;
            System.out.println(m);
        } while (br.ready());
    }
}