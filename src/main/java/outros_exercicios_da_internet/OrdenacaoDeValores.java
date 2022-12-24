package outros_exercicios_da_internet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
    Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
    o seguinte critério:
    • Primeiro os Pares
    • Depois os Ímpares
    Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
    em ordem decrescente.
 */

public class OrdenacaoDeValores {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdNumeros = scan.nextInt();
        List<Integer> lista = new ArrayList<>();

        for(int i = 0; i < qtdNumeros; i++){
            Integer valor = scan.nextInt();
            lista.add(valor);
        }

        lista.stream().filter(a -> a % 2 == 0)
                .sorted(Integer::compare)
                .forEach(System.out::println);

        lista.stream().filter(a -> a % 2 > 0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
