package beecrowd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Multiplos {
    /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
        "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

        Entrada
        A entrada contém valores inteiros.

        Saída
        A saída deve conter uma das mensagens conforme descrito acima.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer a = scan.nextInt();
        Integer b = scan.nextInt();

        List<Integer> numeros = Arrays.asList(a ,b)
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        if (numeros.get(0) % numeros.get(1) == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }

}
