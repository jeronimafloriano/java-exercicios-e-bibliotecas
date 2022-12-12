package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeepHydrated {

    public static void main(String[] args) {
        KeepHydratedTest.sampleTest1();
    }

    public int Liters(double time)  {
        var agua = (0.5 * time);
        return (int) agua;
    }
}

class KeepHydratedTest {



    @Test
    public static void sampleTest1() {
        KeepHydrated kh = new KeepHydrated();

        assertEquals(1, kh.Liters(2));
        assertEquals(0, kh.Liters(0.97));
        assertEquals(7, kh.Liters(14.64));
        assertEquals(800, kh.Liters(1600.20));
        assertEquals(40, kh.Liters(80));

    }
}
