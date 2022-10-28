package codewars.fundamentals;

import org.junit.Test;

import java.time.Month;
import java.time.temporal.IsoFields;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class DescendingOrder {

    public static void main(String[] args) {
        DescendingOrderTest.test_01();
    }

    public static int trimestre( int month) {
        //return (int) Math.ceil(month / 3.0f);
        return Month.of(month).get(IsoFields.QUARTER_OF_YEAR);
    }


}

class DescendingOrderTest {

    @Test
    public static void test_01() {
        assertEquals(1,DescendingOrder.trimestre(2));
    }
}