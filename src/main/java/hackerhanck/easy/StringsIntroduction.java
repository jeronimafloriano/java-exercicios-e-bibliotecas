package hackerhanck.easy;

import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        /*For the first line, sum the lengths of  and .
        For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
        For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
         */
        int sumLengths = A.length() + B.length();

        String comparacao = A.compareTo(B) <= 0 ? "No" : "Yes";

        String aComPrimeiraLetraMaiuscula =  A.substring(0,1).toUpperCase().concat(A.substring(1));
        String bComPrimeiraLetraMaiuscula =  B.substring(0,1).toUpperCase().concat(B.substring(1));
        //ou poderia fazer direto na linha de impressão:
        System.out.printf("%S%s %S%s \n", A.substring(0,1),A.substring(1), B.substring(0,1), B.substring(1));

        /* COMO EU FIZ INICIALMENTE A COMPARACAO E A SUBSTITUICAO POR LETRA INICIAL MAIUSCULA:
        String comparacao;
        int comparacaoLexi = A.compareTo(B);
        if (comparacaoLexi <= 0){
            comparacao = "NO";
        } else {
            comparacao = "YES";
        }

        char first = A.charAt(0);
        String firstString = String.valueOf(first);
        String firstUpper = firstString.toUpperCase();
        String aComPrimeiraLetraMaiuscula = A.replaceAll(firstString, firstUpper);

        char firstB = B.charAt(0);
        String firstStringB = String.valueOf(firstB);
        String firstUpperB = firstStringB.toUpperCase();
        String bComPrimeiraLetraMaiuscula = B.replaceAll(firstStringB, firstUpperB);*/

        System.out.println(sumLengths);
        System.out.println(comparacao);
        System.out.println(aComPrimeiraLetraMaiuscula + " " + bComPrimeiraLetraMaiuscula);
    }
}
