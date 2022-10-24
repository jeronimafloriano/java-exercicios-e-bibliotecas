package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneNumber {

    public static void main(String[] args) {
        PhoneExampleTests.tests();
    }
        public static String createPhoneNumber(int[] numbers) {

            String phone = "(xxx) xxx-xxxx";
            for(int i : numbers){
                phone = phone.replaceFirst("x", Integer.toString(i));
            }
            return phone;


        }

}

class PhoneExampleTests {
    @Test
    public static void tests() {
        assertEquals("(123) 456-7890",
                PhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
