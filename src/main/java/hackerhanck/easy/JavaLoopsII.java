package hackerhanck.easy;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        for(int i = 0; i < x; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            double s = a;

            for(int y = 1; y <= n; y++){
                s = s + (Math.pow(2, y - 1) *b);
                System.out.print((int) s + " ");
            }

            System.out.println();
        }

        scan.close();
    }
}
