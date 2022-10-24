package beecrowd;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class SortSimples {
    /*
        Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em
        ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n1 = scanner.nextInt();
        Integer n2 = scanner.nextInt();
        Integer n3 = scanner.nextInt();

        List<Integer> numeros = Arrays.asList(n1, n2, n3);
        List<Integer> numerosOrdenados = Arrays.asList(n1, n2, n3);

        numerosOrdenados.sort(Integer::compareTo);

        numerosOrdenados.forEach(System.out::println);
        System.out.println();
        numeros.forEach(System.out::println);
    }
}


