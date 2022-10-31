package codewars.fundamentals;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class ThinkfulLogicDrillsTrafficLight {
    public static void main(String[] args) {
        ThinkfulLogicDrillsTrafficLightTest.update_light();
    }
    public static String updateLight(String current) {
        String semaforo = Map.of("green", "yellow", "yellow", "red", "red", "green")
                        .get(current);
        return semaforo;
    }

}

class ThinkfulLogicDrillsTrafficLightTest {
    @Test
    public static void update_light() {
        assertEquals("green", ThinkfulLogicDrillsTrafficLight.updateLight("red"));
        assertEquals("yellow", ThinkfulLogicDrillsTrafficLight.updateLight("green"));
        assertEquals("red", ThinkfulLogicDrillsTrafficLight.updateLight("yellow"));
    }
}
