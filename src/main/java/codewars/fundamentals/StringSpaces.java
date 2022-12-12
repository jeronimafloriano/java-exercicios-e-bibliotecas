package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringSpaces {

    public static void main(String[] args) {
        StringSpacesTest.testSomething();
    }

    public static String noSpace(final String x) {
        String semEspaco = x.trim().replaceAll("\\s+", "");
        // trim() remove  os espacos nas extremidades(iniciais e finais)
        //.replaceAll("\\s+", "") substitui  todos os espacos vazios
        return semEspaco;
    }
}

class StringSpacesTest {
    @Test
    public static void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", StringSpaces.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", StringSpaces.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", StringSpaces.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", StringSpaces.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", StringSpaces.noSpace("8j aam"));
    }
}