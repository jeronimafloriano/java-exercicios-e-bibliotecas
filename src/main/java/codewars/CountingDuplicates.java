package codewars;

import org.junit.Test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class CountingDuplicates {
    public static void main(String[] args) {
        SolutionTest.abcdeReturnsZero();
        SolutionTest.abcdeaReturnsOne();
        SolutionTest.indivisibilityReturnsOne();
        SolutionTest.reallyLongStringContainingDuplicatesReturnsThree();
    }

    public static int duplicateCount(String text) {
        Map<Character, Long> letras = text.codePoints()
                .map(Character::toLowerCase)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Long letrasRepetidas = letras.values().stream().filter(c -> c > 1 ).count();
        return letrasRepetidas.intValue();

    }
}

class SolutionTest {
    @Test
    public static void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }

    @Test
    public static void abcdeaReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    }

    @Test
    public static  void indivisibilityReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }

    @Test
    public static  void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(3, CountingDuplicates.duplicateCount(test));
    }


}