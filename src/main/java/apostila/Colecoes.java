package apostila;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Colecoes {

    public static void main(String[] args) {

        List<Integer> idades = Arrays.asList(15, 46, 75, 34, 23);
        idades.forEach(System.out::println);

        Integer somaEx1 = idades.stream().reduce(0, Integer::sum);
        Integer somaEx2 = idades.stream().collect(Collectors.summingInt(Integer::intValue));
        Integer somaEx3 = idades.stream().mapToInt(Integer::intValue).sum();
        Integer somaEx4 = idades.stream().mapToInt(Integer::valueOf).sum();

        System.out.println(somaEx1);
        System.out.println(somaEx2);
        System.out.println(somaEx3);
        System.out.println(somaEx4);
    }
}
