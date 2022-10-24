package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhoLikesIt {
    public static void main(String[] args) {
        WhoLikesITests.tests();
    }

    public static String whoLikes(String[] names){
        String who = "%s likes this";
        String who2 = "%s and %s like this";
        String who3 = "%s, %s and %s like this";

        return names.length == 0 ? String.format(who, "no one") :
                names.length == 1 ? String.format(who, names[0]) :
                names.length == 2 ? String.format(who2, names[0], names[1]) :
                names.length == 3 ? String.format(who3, names[0], names[1], names[2]) :
                String.format(who3, names[0], names[1], (names.length - 2) + " others");

    }
}

class WhoLikesITests {
    @Test
    public static void tests() {

        assertEquals("no one likes this",
                WhoLikesIt.whoLikes(new String[] {}));

        assertEquals("Peter likes this",
                WhoLikesIt.whoLikes(new String[] {"Peter"}));

        assertEquals("Jacob and Alex like this",
                WhoLikesIt.whoLikes(new String[] {"Jacob", "Alex"}));

        assertEquals("Max, John and Mark like this",
                WhoLikesIt.whoLikes(new String[] {"Max", "John", "Mark"}));

        assertEquals("Alex, Jacob and 2 others like this",
                WhoLikesIt.whoLikes(new String[] {"Alex", "Jacob", "Mark", "Max"}));

    }


}
