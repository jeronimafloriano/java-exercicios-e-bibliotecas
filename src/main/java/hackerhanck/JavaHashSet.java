package hackerhanck;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashSet {

    public static void main(String[] args) {
//        SERIA MELHOR ASSIM MAS O HACKER HANCK NAO DEIXOU ALTERAR O CÓDIGO INICIAL:
//        Scanner s = new Scanner(System.in);
//        int qtEntrada = s.nextInt();
//
//        Set<String> nomes = new HashSet<>();
//
//        for (int i = 0; i < qtEntrada; i++) {
//            nomes.add(s.nextLine());
//            System.out.println(nomes.size());
//        }
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }


        Set<String> nomes = new HashSet<>();
        for (int i = 0; i < t; i++) {
            nomes.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(nomes.size());
        }
    }
}
