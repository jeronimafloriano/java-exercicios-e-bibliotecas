package codewars.fundamentals;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.Assert.assertArrayEquals;

public class PowersOf2 {
    public static void main(String[] args) {
        PowersOf2Test.testSomething();
    }
    public static long[] powersOfTwo(int n){
        long [] numeros = new long[n+1];
        for(int i = 0; i <= n; i++){
            numeros[i] = (long) Math.pow(2, i);
        }
        return numeros;
        // return LongStream.rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();

    }
}

class PowersOf2Test {
    @Test
    public static void testSomething() {
        assertArrayEquals(new long[]{1}, PowersOf2.powersOfTwo(0));
        assertArrayEquals(new long[]{1,2}, PowersOf2.powersOfTwo(1));
        assertArrayEquals(new long[]{1,2,4,8,16}, PowersOf2.powersOfTwo(4));
    }
}