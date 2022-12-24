package codewars.fundamentals;

import org.junit.Test;


import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class SumHighestAndLowestNumber {

    public static void main(String[] args) {
        SumHighestAndLowestNumberTest.basicTests();
    }

    public static int sum(int[] numbers) {

        return (numbers == null || numbers.length <= 2) ? 0 :
                IntStream.of(numbers).sum() - IntStream.of(numbers).max().getAsInt()
                        - IntStream.of(numbers).min().getAsInt();

    }

}


class SumHighestAndLowestNumberTest {
    @Test
    public static void basicTests() {
        assertEquals(17, SumHighestAndLowestNumber.sum(new int[] { 6, 2, 1, 1, 8, 10}));
    }
}