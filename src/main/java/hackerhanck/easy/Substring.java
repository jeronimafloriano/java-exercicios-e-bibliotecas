package hackerhanck.easy;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase = scan.next();
        int start = scan.nextInt();
        int ends = scan.nextInt();

        System.out.println(frase.substring(start, ends));
    }
}
