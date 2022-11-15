package codewars.fundamentals;

import org.junit.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class CountOddNumbersBelowN {

    public static int oddCount(int n){
//        var a = IntStream.rangeClosed(1, n).filter(b -> b % 2 == 0).count();
//        return (int) a;
        return n / 2;
    }

    public static void main(String[] args) {
        CountOddNumbersBelowNTest.fixedTests();
    }
}

class CountOddNumbersBelowNTest {
    @Test
    public static void fixedTests() {
        assertEquals(7, CountOddNumbersBelowN.oddCount(15));
        assertEquals(7511, CountOddNumbersBelowN.oddCount(15023));
    }
}
