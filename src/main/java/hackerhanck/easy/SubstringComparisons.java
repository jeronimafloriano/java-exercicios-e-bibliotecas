package hackerhanck.easy;


import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String palavra, int tamanho) {
        int tamanhoPalavra = palavra.length();

        String min = palavra.substring(0,tamanho);
        String max = palavra.substring(0,tamanho);

        for(int i = 0; i <= tamanhoPalavra-tamanho; i++){

            String temp = palavra.substring(i, i + tamanho);
            max = max.compareTo(temp) > 0 ? max:temp;
            min = min.compareTo(temp) < 0 ? min:temp;
        }

        return min + "\n" + max;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String palavra = scan.next();
        int tamanho = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(palavra, tamanho));

    }
}
