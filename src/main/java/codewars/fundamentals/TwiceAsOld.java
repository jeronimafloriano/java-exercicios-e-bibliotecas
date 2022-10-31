package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwiceAsOld {

    public static void main(String[] args) {
        TwiceAsOldTest.testSomething();
    }

    public static int TwiceAsOld(int dadYears, int sonYears){
        int dobro = sonYears * 2;
        int quando = dadYears - dobro;
        return Math.abs(quando);
    }
}

class TwiceAsOldTest {
    @Test
    public static void testSomething() {
        assertEquals(30, TwiceAsOld.TwiceAsOld(30,0));
        assertEquals(16, TwiceAsOld.TwiceAsOld(30,7));
        assertEquals(15, TwiceAsOld.TwiceAsOld(45,30));

    }
}