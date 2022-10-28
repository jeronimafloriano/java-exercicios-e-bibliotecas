package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringAbbrevName {
    public static void main(String[] args) {
        SolutionTest.testFixed();
    }

    public static String abbrevName(String name) {
        String [] nomes = name.split(" ");
        return (nomes[0].charAt(0) + "." + nomes[1].charAt(0)).toUpperCase();
    }
}

class SolutionTest {

    @Test
    public static void testFixed() {
        assertEquals("S.H", StringAbbrevName.abbrevName("Sam Harris"));
        assertEquals("P.F", StringAbbrevName.abbrevName("Patrick Feenan"));
        assertEquals("E.C", StringAbbrevName.abbrevName("Evan Cole"));
        assertEquals("P.F", StringAbbrevName.abbrevName("P Favuzzi"));
        assertEquals("D.M", StringAbbrevName.abbrevName("David Mendieta"));
    }
}