package codewars.fundamentals;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class CountingSheep {


    public static void main(String[] args) {
        CountingSheepTest.testSomething();
    }
    public static String countingSheep(int num) {
        StringBuilder sheep = new StringBuilder("");
        if(num > 0){
            for(int i = 1; i <= num; i++){
                sheep.append(String.format("%d sheep...", i));
            }
        }
        return sheep.toString();

        /*
        return IntStream.rangeClosed(1, num)
                    .mapToObj(i -> i + " sheep...")
                    .collect(Collectors.joining());
                    */
    }
}

class CountingSheepTest {
    @Test
    public static void testSomething() {
        assertEquals("", CountingSheep.countingSheep(0));
        assertEquals("1 sheep...", CountingSheep.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", CountingSheep.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", CountingSheep.countingSheep(3));
    }
}