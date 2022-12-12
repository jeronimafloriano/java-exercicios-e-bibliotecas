package hackerhanck;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();

        if(s.length() == 0){
            System.out.println(0);
            return;
        }

       // String [] linhas = s.replaceAll("\\s+$", "").split("[^A-Za-z]+");
       // String[] linhas = s.split("[\\s,!?._'@]+");
        String[] linhas = s.replaceAll("\\s+$", "").split("[!,?._@ \']+");

        long  b = Arrays.stream(linhas).count();
        System.out.println(b);
        Arrays.stream(linhas).forEach(a -> System.out.println(a));

        scan.close();
    }
}
