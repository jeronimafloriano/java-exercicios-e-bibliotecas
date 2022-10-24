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

        /*
            String who = "no one likes this";
            String who2 = "X and X like this";
            String who3 = "X, X and X like this";

            if(names.length == 1){
                String pedacoAConcatenar = who.substring(6,who.length());
                who = names[0].concat(pedacoAConcatenar);
            } else if(names.length == 2){
                who2 = who2.replaceFirst("X", names[0]);
                who2 = who2.replaceFirst("X", names[1]);
                return who2;
            } else if (names.length == 3) {
                who3 = who3.replaceFirst("X", names[0]);
                who3 = who3.replaceFirst("X", names[1]);
                who3 = who3.replaceFirst("X", names[2]);
                return who3;
            }
            else if (names.length > 3) {
                who3 = who3.replaceFirst("X", names[0]);
                who3 = who3.replaceFirst("X", names[1]);
                String pedacoAConcatenar2 = (names.length - 2) + " others";
                who3 = who3.replaceFirst("X", pedacoAConcatenar2);
                return who3;
            }

            return who;*/
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
