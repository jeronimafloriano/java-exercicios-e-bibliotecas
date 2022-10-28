package codewars;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class AccumulStrings {

    public static void main(String[] args) {
        AccumulTest.test();
    }
    public static String accum(String s) {
        // ZpglnRxqenU = Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu"

        var chars = s.split("");
        return IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i].toUpperCase() + chars[i].toLowerCase().repeat(i))
                .collect(Collectors.joining("-"));

        /*List<Character> letras = s.codePoints()
                .map(Character::toLowerCase)
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        List<String> list = new ArrayList<>();
        for(int i = 0; i < letras.size(); i++){
            Character letra = letras.get(i); //z
            int posicao = i+1; //z=1 = Z
            String letraMaiscula = letra.toString().toUpperCase();
            list.add(letraMaiscula);

            if(posicao == 1){
                posicao = 0;
            }
            for(int z = 1; z < posicao; z++){
                list.add(letra.toString());
            }
            list.add("-");
            s = String.join("", list);
        }
        s = s.substring(0,s.length()-1);
        return s;*/



    }
}


class AccumulTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public static void test() {
        System.out.println("Fixed Tests accum");
        testing(AccumulStrings.accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
        testing(AccumulStrings.accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
        testing(AccumulStrings.accum("MjtkuBovqrU"), "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
        testing(AccumulStrings.accum("EvidjUnokmM"), "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
        testing(AccumulStrings.accum("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
    }
}
