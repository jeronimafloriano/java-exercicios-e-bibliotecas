package hackerhanck.Comparators;

import java.util.Comparator;

public class ComparatorChecker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        var result = Integer.compare(a.score, b.score);
        return result < 0 ? (1) : result > 0 ? (-1) : a.name.compareTo(b.name);
    }

    /*
    a negative integer = as the first argument is less than
    zero = equal to
    positive integer = greater than the second
     */
}
