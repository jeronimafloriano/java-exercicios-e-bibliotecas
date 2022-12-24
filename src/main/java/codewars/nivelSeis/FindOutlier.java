package codewars.nivelSeis;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class FindOutlier {

    public static void main(String[] args) {
        OutlierTest.testExample();

    }

    static int find(int[] integers){

        final int p = Arrays.stream(integers).limit(3).map(Math::abs).map(i -> i % 2).sum() / 2;
		return Arrays.stream(integers).filter(i -> Math.abs(i) % 2 != p).findFirst().getAsInt();


    }
}

class OutlierTest{
    @Test
    public static void testExample() {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        int[] exampleTest4 = {2,6,8,10,3};
        int[] exampleTest5 = {2,6,8,10,-3};
        int[] exampleTest6 = {17,15,8,10,4};

        //assertEquals(3, FindOutlier.find(exampleTest1));
        //assertEquals(206847684, FindOutlier.find(exampleTest2));
        //assertEquals(0, FindOutlier.find(exampleTest3));
       // assertEquals(3, FindOutlier.find(exampleTest4));
        //assertEquals(-3, FindOutlier.find(exampleTest5));
        assertEquals(3, FindOutlier.find(exampleTest6));
    }}