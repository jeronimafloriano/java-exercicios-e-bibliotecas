package hackerhanck;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        List<List<Integer>> lista = new ArrayList<>();
        List<Object> lista2 = new ArrayList<>();

        for (int i = 0; i < a; i++){
            int tamanho = scan.nextInt();
            lista.add(i,new ArrayList<>(tamanho));

            for (int x = 0; x < tamanho; x++){
                lista.get(i).add(scan.nextInt());
            }
        }

        int pega = scan.nextInt();
        int qualLista = 0;
        int qualPosicao = 0;

        for (int y = 0; y < pega; y++) {
            qualLista = scan.nextInt();
            qualPosicao = scan.nextInt();

            if (qualLista > lista.size() || qualPosicao > lista.get(qualLista - 1).size()) {
                lista2.add("ERROR!");
            } else {
                lista2.add(lista.get(qualLista - 1).get(qualPosicao - 1));
            }
        }
        scan.close();

        lista2.forEach(System.out::println);
    }
}
