package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoZerosForHeros {

    public static void main(String[] args) {
        NoZerosForHerosTest.test1();
    }

    public static int noBoringZeros(int n) {
        return n == 0 || n % 10 != 0 ? n : noBoringZeros(n/10);
    }
}

class NoZerosForHerosTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public static void test1() {
        System.out.println("Fixed Tests: noBoringZeros");
        testing(NoZerosForHeros.noBoringZeros(1450), 145);
        testing(NoZerosForHeros.noBoringZeros(960000), 96);
        testing(NoZerosForHeros.noBoringZeros(1050), 105);
        testing(NoZerosForHeros.noBoringZeros(-1050), -105);
    }
}