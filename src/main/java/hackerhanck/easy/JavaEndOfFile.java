package hackerhanck.easy;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto;
        int contador = 1;

        while (scan.hasNext()){
            texto = scan.nextLine();
            System.out.println(contador + " " + texto);
            contador++;
        }
    }
}
