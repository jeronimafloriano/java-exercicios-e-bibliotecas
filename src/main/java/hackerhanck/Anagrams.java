package hackerhanck;


import java.util.Arrays;
import java.util.Scanner;


public class Anagrams {

    static boolean isAnagram(String a, String b) {
        char [] s1 = a.toLowerCase().toCharArray(); //passando para um array de char, pegando cada caractere
        char [] s2 = b.toLowerCase().toCharArray();
        Arrays.sort(s1); //ordenando os caracteres
        Arrays.sort(s2);
        return Arrays.equals(s1, s2); //verificando se são iguais
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
