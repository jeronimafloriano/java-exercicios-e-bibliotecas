package apostila;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ValorMaior {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int valor2 = scanner.nextInt();

        System.out.println("Forma 1 fazendo com if/else:");
        if(valor > valor2){
            System.out.println("O maior valor é: " + valor);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }

        System.out.println("----------------------------------------");
        System.out.println("Forma 2 fazendo com Stream e Comparator:");

        List<Integer> valores = Arrays.asList(valor, valor2);
        valores.stream().max(Comparator.comparing(Integer::valueOf)).ifPresent(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Forma 3 fazendo com Math:");
        System.out.println(Math.max(valor, valor2));


    }
}
