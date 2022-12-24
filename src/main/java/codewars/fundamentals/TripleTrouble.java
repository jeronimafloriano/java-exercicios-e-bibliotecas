package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleTrouble {
    public static void main(String[] args) {
        TripleTroubleTests.tests();
    }

    public static String tripleTrouble(String one, String two, String three) {
        String palavra = "";
        for(int i = 0; i < one.length(); i++){
            palavra = palavra.concat(one.substring(i,i+1))
                    .concat(two.substring(i,i+1))
                    .concat(three.substring(i,i+1));
        }
        return palavra;

        //return IntStream.range(0,one.length())
        //  .mapToObj(i -> "" + one.charAt(i) + two.charAt(i) + three.charAt(i))
        //  .collect(Collectors.joining());
    }
}

class TripleTroubleTests {

    @Test
    public static void tests() {
        assertEquals("ttlheoiscstk", TripleTrouble.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", TripleTrouble.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", TripleTrouble.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", TripleTrouble.tripleTrouble("LLh","euo","xtr"));
    }
}