package codewars;

import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


import static org.junit.Assert.assertEquals;

public class SumHighestAndLowest {

    public static void main(String[] args) {
        SumHighestAndLowestTest.BasicTests();
    }

    public static int sum(int[] numbers) {
        List<Integer> lista = new ArrayList<>();
        Arrays.stream(numbers).forEach(i -> lista.add(i));
        var maior = lista.stream().max(Comparator.comparing(Integer::valueOf)).get();
        var menor = lista.stream().min(Comparator.comparing(Integer::valueOf)).get();
        var soma = lista.stream().filter(c -> c != maior && c != menor)
                .mapToInt((Integer::valueOf)).sum();
        return soma;
    }
}

class SumHighestAndLowestTest{
    @Test
    public static void BasicTests() {
        assertEquals(16, SumHighestAndLowest.sum(new int[] { 6, 2, 1, 8, 10}));
    }
}
