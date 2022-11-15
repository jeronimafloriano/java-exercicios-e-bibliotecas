package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrasshopperMove {
    public static void main(String[] args) {
        GrasshopperMoveTest.basicTests();
    }

    public static int move(int position, int roll){
        var rolagem = position + roll;
        return rolagem + roll;
    }
}

class GrasshopperMoveTest {
    @Test
    public static void basicTests() {
        assertEquals(8, GrasshopperMove.move(0, 4));
        assertEquals(15, GrasshopperMove.move(3, 6));
        assertEquals(12, GrasshopperMove.move(2, 5));
    }
}