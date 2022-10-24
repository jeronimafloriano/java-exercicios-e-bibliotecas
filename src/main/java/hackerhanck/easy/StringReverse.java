package hackerhanck.easy;

import java.util.Scanner;

public class StringReverse {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        StringBuilder strBuilder = new StringBuilder(s);
        String reverseStr = strBuilder.reverse().toString();
        if (reverseStr.equals(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

       /* FORMA QUE EU FIZ INICIALMENTE:
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        StringBuilder builder = new StringBuilder(s);
        StringBuilder reverse = builder.reverse();

        int contador = 0;
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = reverse.charAt(i);
            if(String.valueOf(a).compareTo(String.valueOf(b)) == 0){
                contador++;
            }
        }
            if(contador == s.length()){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }

        */
    }

}
