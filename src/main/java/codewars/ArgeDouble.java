package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgeDouble {

    public static void main(String[] args) {
        ArgeTest.test1();
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        double popAtual = p0;
        double porcentagem = percent / 100;
        int qtdAno = 0;

        while(popAtual < p){
            popAtual = popAtual + (popAtual * porcentagem) + aug;
            qtdAno++;
        }

        return qtdAno;
    }

}

class ArgeTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public static void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(ArgeDouble.nbYear(1500, 5, 100, 5000),15);
        testing(ArgeDouble.nbYear(1000, 2, 50, 1200),3);
        testing(ArgeDouble.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(ArgeDouble.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}