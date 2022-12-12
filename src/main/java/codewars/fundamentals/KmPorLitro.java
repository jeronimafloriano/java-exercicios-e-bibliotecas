package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KmPorLitro {

    public static void main(String[] args) {
        KmPorLitroTest.testSomething();
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return mpg * fuelLeft >= distanceToPump;
    }
}

class KmPorLitroTest {
    @Test
    public static void testSomething() {
        assertTrue(KmPorLitro.zeroFuel(50, 25, 2));
        assertFalse(KmPorLitro.zeroFuel(100, 50, 1));
    }
}
