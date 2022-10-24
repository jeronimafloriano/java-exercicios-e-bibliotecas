package hackerhanck.easy.abstractclass;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook book = new MyBook();
        book.setTitle(title);
        System.out.println("The title is: "+ book.getTitle());
        sc.close();
    }
}
