package hackerhanck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntaxChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qt = Integer.parseInt(scan.nextLine());

        if(qt > 0){
            List<String> lista = new ArrayList<>();

            for (int i = 0; i < qt; i++) {
                try {
                    Pattern.compile(scan.nextLine());
                    lista.add("Valid");
                } catch (PatternSyntaxException e) {
                    lista.add("Invalid");
                }
            }
            lista.forEach(System.out::println);
        }

    }
}
