package codewars.fundamentals;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class VolumesOfCuboids {

    public static void main(String[] args) {

        TestVolumesOfCuboids.sampleTestCases();

    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        var a = Arrays.stream(firstCuboid).reduce((n1, n2) -> n1 * n2).getAsInt();
        var b = Arrays.stream(secondCuboid).reduce((n1, n2) -> n1 * n2).getAsInt();

        return Math.abs(a - b);
    }
}

class TestVolumesOfCuboids {
    @Test
    public static void sampleTestCases() {
        assertEquals(14, VolumesOfCuboids.findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
        assertEquals(106, VolumesOfCuboids.findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2}));
        assertEquals(30, VolumesOfCuboids.findDifference(new int[]{11, 2, 5}, new int[]{1, 10, 8}));
        assertEquals(31, VolumesOfCuboids.findDifference(new int[]{4, 4, 7}, new int[]{3, 9, 3}));
        assertEquals(0, VolumesOfCuboids.findDifference(new int[]{15, 20, 25}, new int[]{10, 30, 25}));
    }
}

