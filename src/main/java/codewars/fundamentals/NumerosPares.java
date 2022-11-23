package codewars.fundamentals;

import org.junit.Test;

import java.util.stream.IntStream;

import static junit.framework.TestCase.assertEquals;

public class NumerosPares {

    public static void main(String[] args) {
        TestNumerosPares.exampleTests();
    }

    public static int nthEven(int n) {
        return n * 2 - 2 ;
    }

}

class TestNumerosPares {
    @Test
    public static void exampleTests() {
        assertEquals(0, NumerosPares.nthEven(1));
        assertEquals(2, NumerosPares.nthEven(2));
        assertEquals(4, NumerosPares.nthEven(3));
        assertEquals(198, NumerosPares.nthEven(100));
        assertEquals(2597466, NumerosPares.nthEven(1298734));
    }
}
