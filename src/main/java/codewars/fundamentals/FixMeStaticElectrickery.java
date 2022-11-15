package codewars.fundamentals;

import org.junit.Test;

public class FixMeStaticElectrickery {

    private static int ONE_HUNDRED = 100;

    public static final FixMeStaticElectrickery INST = new FixMeStaticElectrickery();

    private final int value;

    private FixMeStaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static void main(String[] args) {
        FixMeStaticElectrickeryTests.test();
    }
}

class FixMeStaticElectrickeryTests {

    @Test
    public static void test() {
        System.out.println(FixMeStaticElectrickery.INST.plus100(23));
    }

}
