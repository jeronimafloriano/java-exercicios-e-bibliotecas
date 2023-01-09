package hackerhanck.Comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Player implements Comparable<Player> {
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Player b) {
        var result = Integer.compare(this.score, b.score);
        return result < 0 ? (1) : result > 0 ? (-1) : this.name.compareTo(b.name);
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
       // ComparatorChecker checker = new ComparatorChecker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        //Arrays.sort(player, checker);
        Arrays.sort(player);

        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
