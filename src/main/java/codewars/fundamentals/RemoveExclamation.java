package codewars.fundamentals;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class RemoveExclamation {

    public static void main(String[] args) {
        RemoveExclamationTest.fixedTests();
    }

    public static String remove(String s, int n){
        String semExclamacao = s;

        if(n >= semExclamacao.length()){
            semExclamacao  = semExclamacao.replaceAll("!", "");
        } else {
            for(int i = 0; i < n ; i++) {
                semExclamacao  = semExclamacao.replaceFirst("!", "");
            }
        }

        return semExclamacao;

    }
}

class RemoveExclamationTest {
    @Test
    public static void fixedTests() {
            assertEquals("Hi", RemoveExclamation.remove("Hi!", 1));
            assertEquals("Hi", RemoveExclamation.remove("Hi!", 100));
            assertEquals("Hi!!", RemoveExclamation.remove("Hi!!!", 1));
            assertEquals("Hi", RemoveExclamation.remove("Hi!!!", 100));
            assertEquals("Hi", RemoveExclamation.remove("!Hi", 1));
            assertEquals("Hi!", RemoveExclamation.remove("!Hi!", 1));
            assertEquals("Hi", RemoveExclamation.remove("!Hi!", 100));
            assertEquals("!!Hi !!hi!!! !hi", RemoveExclamation.remove("!!!Hi !!hi!!! !hi", 1));
            assertEquals("Hi !!hi!!! !hi", RemoveExclamation.remove("!!!Hi !!hi!!! !hi", 3));
            assertEquals("Hi hi!!! !hi", RemoveExclamation.remove("!!!Hi !!hi!!! !hi", 5));
            assertEquals("Hi hi hi", RemoveExclamation.remove("!!!Hi !!hi!!! !hi", 100));
    }
}

