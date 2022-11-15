package codewars.fundamentals;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

public class HumanYears {
    /*  NOTES: humanYears >= 1
        Cat Years
        15 cat years for first year
        +9 cat years for second year
        +4 cat years for each year after that

        Dog Years
        15 dog years for first year
        +9 dog years for second year
        +5 dog years for each year after that
     */

    public static void main(String[] args) {
        HumanYearsCatYearsDogYearsTest.tests();
    }


    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catyears = humanYears == 1 ? 15 : 16 + (4 * humanYears);
        int dogyears = humanYears == 1 ? 15 : 14 + (5 * humanYears);
        return new int[] {humanYears, catyears, dogyears};
    }
}

class HumanYearsCatYearsDogYearsTest {

    @Test
    public static void tests() {
        assertArrayEquals(new int[]{1,15,15}, HumanYears.humanYearsCatYearsDogYears(1));
        assertArrayEquals(new int[]{2,24,24}, HumanYears.humanYearsCatYearsDogYears(2));
        assertArrayEquals(new int[]{10,56,64}, HumanYears.humanYearsCatYearsDogYears(10));
    }

}
