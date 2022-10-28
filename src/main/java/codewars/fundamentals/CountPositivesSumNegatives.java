package codewars.fundamentals;

import org.junit.Test;

import java.util.Arrays;


import static org.junit.Assert.assertArrayEquals;

public class CountPositivesSumNegatives {

    public static void main(String[] args) {
        KataTests.countPositivesSumNegatives_BasicTest();
        KataTests.countPositivesSumNegatives_InputWithZeroes();
        KataTests.countPositivesSumNegatives_InputEmpty();
        KataTests.countPositivesSumNegatives_InputNull();
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int[] nums = {};

        if(input != null && input.length > 0) {
            var countPositives = Arrays.stream(input).filter(c -> c > 0).count();
            var sumNegatives = Arrays.stream(input).filter(c -> c < 0).sum();
            nums = new int[]{(int) countPositives, sumNegatives};
        }

        return nums;
    }


}

class KataTests {
    @Test
    public static void countPositivesSumNegatives_BasicTest() {
        int[] expectedResult = new int[] {10, -65};
        assertArrayEquals(expectedResult, CountPositivesSumNegatives
                .countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public static void countPositivesSumNegatives_InputWithZeroes() {
        int[] expectedResult = new int[] {8, -50};
        assertArrayEquals(expectedResult, CountPositivesSumNegatives
                .countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }

    @Test
    public static void countPositivesSumNegatives_InputEmpty() {
        int[] expectedResult = new int[] {};
        assertArrayEquals(expectedResult, CountPositivesSumNegatives
                .countPositivesSumNegatives(expectedResult));
    }

    @Test
    public static void countPositivesSumNegatives_InputNull() {
        int[] expectedResult = new int[] {};
        assertArrayEquals(expectedResult, CountPositivesSumNegatives
                .countPositivesSumNegatives(null));
    }
}
