package hackerhanck;

import java.util.Scanner;


public class StaticInitializerBlock {
    public static boolean flag = false;
    public static int B;
    public static int H;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if(B>0 && H>0){
            flag = true;
        } else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}

