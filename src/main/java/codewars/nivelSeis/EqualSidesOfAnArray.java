package codewars.nivelSeis;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class EqualSidesOfAnArray {

    public static void main(String[] args) {
        EqualSidesOfAnArrayTest.test();
    }

    public static int findEvenIndex(int[] arr) {

        return IntStream.range(0, arr.length)
				.filter(n ->
                        IntStream.of(arr).limit(n).sum()  //esquerda
                        == IntStream.of(arr).skip(n + 1).sum()) //direita
                    .findFirst()
                    .orElse(-1);

    }
}


class EqualSidesOfAnArrayTest {
    @Test
    public static void test() {
        assertEquals(3,EqualSidesOfAnArray.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        assertEquals(1,EqualSidesOfAnArray.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        assertEquals(-1,EqualSidesOfAnArray.findEvenIndex(new int[] {1,2,3,4,5,6}));
        assertEquals(3,EqualSidesOfAnArray.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
        assertEquals(-1,EqualSidesOfAnArray.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
        assertEquals(1,EqualSidesOfAnArray.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals(6,EqualSidesOfAnArray.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
        assertEquals(0,EqualSidesOfAnArray.findEvenIndex(new int[] {20,10,-80,10,10,15,35}));

    }
}