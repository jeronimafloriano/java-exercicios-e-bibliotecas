package hackerhanck.Comparators;

import java.util.Comparator;

public class ComparatorChecker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        if (a.score < b.score) {
            return 1;
        } else if (a.score > b.score) {
            return -1;
        } else {
            return a.name.compareTo(b.name);
        }
    }

    /*
    a negative integer = as the first argument is less than
    zero = equal to
    positive integer = greater than the second
     */
}
