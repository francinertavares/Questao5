package Questao5;

import java.util.Scanner;

// Faça um Programa que converta metros para centímetros.
public class Exerc5 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        float m, cm;

        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Metragem:");

        m = sc1.nextFloat();

        cm = m * 100;

        System.out.println(cm + " Centímetros");

        sc1.close();

    }
}
