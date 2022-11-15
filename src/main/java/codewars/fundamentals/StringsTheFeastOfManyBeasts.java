package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringsTheFeastOfManyBeasts {
    public static void main(String[] args) {
        StringsTheFeastOfManyBeastsTest.fixedTest();
    }
    public static boolean feast(String beast, String dish) {
        //var a = beast.toLowerCase().toCharArray();
        //var b = dish.toLowerCase().toCharArray();
        //return a[0] == b[0] && a[a.length - 1] == b[b.length - 1];
        return beast.charAt(0) == dish.charAt(0) &&
                beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);
    }
}


class StringsTheFeastOfManyBeastsTest {
    @Test
    public static void fixedTest() {
        assertTrue(StringsTheFeastOfManyBeasts.feast("great blue heron","garlic nann"));
        assertTrue(StringsTheFeastOfManyBeasts.feast("chickadee","chocolate cake"));
        assertFalse(StringsTheFeastOfManyBeasts.feast("brown bear","bear claw"));
    }
}