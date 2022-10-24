package hackerhanck.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListJava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtItens = Integer.parseInt(scan.nextLine());

        List<Integer> lista = new ArrayList<>();

        for(int i = 0; i < qtItens; i++){
            lista.add(scan.nextInt());
        }
        int consultas = scan.nextInt();

        for(int x = 0; x < consultas; x++){
            String acao = scan.next();

            if(acao.equals("Insert")){
                lista.add(scan.nextInt(), scan.nextInt());
            }
            if (acao.equals("Delete")) {
                lista.remove(scan.nextInt());
            }
        }
        lista.forEach(a -> System.out.print(a + " "));

    }
}
