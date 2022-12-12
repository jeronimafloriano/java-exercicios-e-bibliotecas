package codewars.fundamentals;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class PositionAlphabet {

    public static void main(String[] args) {
        PositionAlphabetTest.basicTests();
    }

    public static String position(char alphabet) {
        return "Position of alphabet: " + (alphabet - 96);
    }

}

class PositionAlphabetTest {
    @Test
    public static void basicTests() {
        assertEquals("Position of alphabet: 1", PositionAlphabet.position('a'));
        assertEquals("Position of alphabet: 26", PositionAlphabet.position('z'));
        assertEquals("Position of alphabet: 5", PositionAlphabet.position('e'));
    }
}
