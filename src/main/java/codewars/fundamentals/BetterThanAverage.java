package codewars.fundamentals;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BetterThanAverage {

    public static void main(String[] args) {
        BetterThanAverageTests.tests();
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        /*var totClassPoints = Arrays.stream(classPoints).sum();
        var mediaClassPoints = Math.floorDiv(totClassPoints, classPoints.length);
        return yourPoints > mediaClassPoints ? true : false;*/
        return yourPoints > Arrays.stream(classPoints).average().orElse(0);
    }
}

class BetterThanAverageTests {
    @Test
    public static void tests() {
        assertEquals(true, BetterThanAverage.betterThanAverage(new int[] {2, 3}, 5));
        assertEquals(true, BetterThanAverage.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, BetterThanAverage.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, BetterThanAverage.betterThanAverage(new int[] {100, 90}, 11));
    }
}

