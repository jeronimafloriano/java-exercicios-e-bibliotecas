package hackerhanck.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);

        } catch (ArithmeticException e) {
            System.out.println(e);

        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }




    }
}
