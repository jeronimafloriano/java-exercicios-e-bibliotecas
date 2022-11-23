package bibliotecas;

import java.util.*;

public class Qeues {

    public static void main(String[] args) throws InterruptedException {

        int time = 10;

        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();

        for (int i = time; i >= 0; i--) {
            queue.add(i);
            queue2.add(i);
        }

        System.out.println("Fila: " + queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
            Thread.sleep(1000);
        }
        System.out.println(queue);

        System.out.println("Fila 2: " + queue2);
        var a = heapSort(queue2);
        System.out.println("result: " + a);

    }

    static <E> List<E> heapSort(Collection<E> c) {
        Queue<E> queue = new PriorityQueue<E>(c);
        List<E> result = new ArrayList<E>();

        while (!queue.isEmpty())
            result.add(queue.remove());

        return result;
    }

}
