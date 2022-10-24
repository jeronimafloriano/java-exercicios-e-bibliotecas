package beecrowd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SomaImparesConsecutivosII {
    /*
        Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
        Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos
        os ímpares existentes entre X e Y.

        Entrada
        A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.
         Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

        Saída
        Imprima a soma de todos valores ímpares entre X e Y.
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdNumeros = scan.nextInt();

        List<Integer> numeros;
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < qtdNumeros; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();

            numeros = new ArrayList<>();
            numeros.add(x);
            numeros.add(y);
            numeros.sort(Comparator.naturalOrder());


            int sum = 0;

            for (int a = (numeros.get(0) + 1); a < numeros.get(1); a++){
                if(a % 2 > 0){
                    sum += a;
                }
            }
            impares.add(sum);
        }
        impares.forEach(System.out::println);
    }

}
