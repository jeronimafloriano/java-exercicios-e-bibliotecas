package hackerhanck;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreakCamelCase {

    public static void main(String[] args) {
        BreakCamelCaseTest.tests();
    }
    public static String camelCase(String input) {
        StringBuilder palavra = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            if(input.codePointAt(i) >= 65 && input.codePointAt(i) <= 90) {
                palavra.append(" ");
            }
            palavra.append(input.charAt(i));
        }
        return palavra.toString();

        //return input.replaceAll("([A-Z])", " $1");
    }
}

class BreakCamelCaseTest {
    @Test
    public static void tests() {
        assertEquals( "Incorrect", "camel Casing", BreakCamelCase.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
    }
}
