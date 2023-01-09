package codewars.nivelSeis;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class LongestConsec {

    public static void main(String[] args) {
        LongestConsecTest.test();
    }

    public static String longestConsec(String[] strarr, int k) {
        int array = strarr.length;

        if (array == 0 || k > array || k <= 0){
            return "";
        }

        List<String> lista = new ArrayList<>();

        if(k > 1){
            array--;
        }

        for(int i = 0; i < array; i++){
            int posicao = i;
            var palavra = strarr[i];

            for(int j = 1; j < k; j++){
                if(i == 0){
                    palavra = palavra.concat(strarr[j]);
                } else{
                    if((posicao+1) > array ){
                        break;
                    }
                    palavra = palavra.concat(strarr[posicao+1]);
                    posicao++;
                }
            }

            lista.add(palavra);
        }

        var palavraMaior = lista.stream()
                .max(Comparator.comparingInt(String::length))
                .stream()
                .findFirst()
                .get();
        return palavraMaior;
    }


    /*
        if (k <= 0) {
            return "";
        }

        return IntStream.rangeClosed(0, strarr.length - k)
                .mapToObj(i -> Arrays.stream(strarr, i, i + k).collect(Collectors.joining()))
                .max(Comparator.comparingInt(String::length))
                .orElse("");


    /*
        String longest = "";
        for (int i = 0; i <= strarr.length - k; i++) {
            StringBuilder candidate = new StringBuilder();
            for (int j = 0; j < k; j++) {
                candidate.append(strarr[i + j]);
            }
            if (candidate.length() > longest.length()) {
                longest = candidate.toString();
            }
        }
        return longest;
     */
}

class LongestConsecTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public static void test() {
        System.out.println("longestConsec Fixed Tests");
        testing(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
        testing(LongestConsec.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
        testing(LongestConsec.longestConsec(new String[] {}, 3), "");
        testing(LongestConsec.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        testing(LongestConsec.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
        testing(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");
    }
}
