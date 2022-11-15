package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Dinglemouse {

    public static String replaceDots(final String str) {
        String strReplace = str.replaceAll("\\.", "-");
        return strReplace;
    }

    public static void main(String[] args) {
        DinglemouseTests.testSomeDots();
    }
}

class DinglemouseTests {

    @Test
    public static void testSomeDots() {
        assertTrue("Sorry, try again :-(",
                "one-two-three".equals(Dinglemouse.replaceDots("one.two.three")));
    }

}
