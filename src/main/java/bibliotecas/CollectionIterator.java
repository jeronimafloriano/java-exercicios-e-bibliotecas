package bibliotecas;

import java.util.*;

public class CollectionIterator {


    public static void main(String[] args) {
        Collection<Integer> colecao1 = new ArrayList<>();
        Collection<Integer> colecao2 = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i = 0; i <= 10; i++){
            colecao1.add(i);
            colecao2.add(i);
            set1.add(i);
            set1.add(i+i+i);
            set2.add(i);
        }

        /*
        filter(colecao1);
        System.out.println(colecao1.isEmpty());*/

        colecao1.removeAll(Collections.singleton(2));
        colecao1.removeAll(Collections.singleton(null));//remove todos os elementos nulos,
        // Collections.singleton, é um método de fábrica estático que retorna um imutável Set contendo apenas o elemento especificado.
        System.out.println("Coleção 1 após remover o nº 2: " + colecao1);

        Object[] transfCollectionEmArray = colecao1.toArray();
        System.out.println("Tamanho da coleção: " + colecao1.size()
                + " - tamanho do array criado a partir da coleção: " + transfCollectionEmArray.length);

        Collection<Integer> colecao3 = new ArrayList<>(colecao1);
        System.out.println("Coleção 3 criada a partir da cópia da coleção 1: " + colecao3);


        System.out.println(colecao2 == colecao1);
        System.out.println(set1 == set2);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        set2.addAll(set1);
        System.out.println("Set 2 após adicionar o Set 1: " + set2);
        set1.add(255);
        set2.add(355);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        set1.retainAll(set2); //  transforma s1 na interseção de s1 e s2.
        System.out.println("Set 1 após retainAll Set 2: " + set1);
        set2.removeAll(set1); // transforma s1-se na diferença de conjunto (assimétrica) de s1e s2.
        System.out.println("Set 2 após removeAll set 1: " + set2);


        List<String> list = new ArrayList<String>();
        for (String a : args)
            list.add(a);
        Collections.shuffle(list, new Random());
        System.out.println(list);

        List<Integer> lista = new ArrayList<>(set1);
        System.out.println("Lista criada a partir de um set: " + lista);
        lista.subList(0,5).clear();
        System.out.println("Lista após remover do elemento 0 ao 5: " + lista);

    }

    static void filter(Collection<?> c) {
        for (Iterator<?> it = c.iterator(); it.hasNext(); )
            if (!cond(it.next()))
                it.remove();
    }

    private static boolean cond(Object next) {
        return false;
    }
}
