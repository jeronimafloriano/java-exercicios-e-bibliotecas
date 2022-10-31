package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReturnNegative {

    public static void main(String[] args) {
        MakeNegativeTest.test1();
    }
    public static int makeNegative(final int x) {
        //int negative = (x) - (x * 2);
        //return x > 0 ? negative : x;
        return x > 0 ? -x : x;
        //return x > 0 ? Math.negateExact(x) : x;
    }
}

class MakeNegativeTest {

    @Test
    public static void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
        assertEquals(-5, ReturnNegative.makeNegative(-5));
        assertEquals(0, ReturnNegative.makeNegative(0));

    }
}
