package hackerhanck.easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {

    static Iterator func(ArrayList lista){
        Iterator iterator = lista.iterator();

        while(iterator.hasNext()){
            Object element = iterator.next();
            if(element instanceof String) //Hints: use instanceof operator
                break;
        }
        return iterator;

    }

    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList lista = new ArrayList();

        Scanner scan = new Scanner(System.in);
        int qtdElementos1 = scan.nextInt();
        int qtdElementos2 = scan.nextInt();

        for(int i = 0; i < qtdElementos1; i++){
            lista.add(scan.nextInt());
        }

        lista.add("###");

        for(int i = 0; i< qtdElementos2; i++){
            lista.add(scan.next());
        }

        Iterator iterator = func(lista);
        while(iterator.hasNext()){
            Object elementoDaListaASerImpresso = iterator.next();
            System.out.println((String)elementoDaListaASerImpresso);
        }
    }

}
