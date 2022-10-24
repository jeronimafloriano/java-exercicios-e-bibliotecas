package apostila;

import java.util.Scanner;

public class Incrementa1 {

    public static void main(String[] args) {
        /*
        Crie um programa que recebe um número e
        incrementa ele por 1 por 10 vezes
         */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i <= 10; i++){
            int valorIncrementado = Math.incrementExact(a);
            System.out.println(i + "° repetição: | valor = " + a + " + 1 | " + valorIncrementado);
            a = valorIncrementado;
        }

    }
}
