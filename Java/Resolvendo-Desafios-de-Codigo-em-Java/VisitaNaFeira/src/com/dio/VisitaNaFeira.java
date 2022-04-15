package com.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VisitaNaFeira {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        //Altere o valor da variável com o cálculo esperado. Resolução: a+b
        int total = a + b;

        System.out.println("X = "+total);
    }
}
