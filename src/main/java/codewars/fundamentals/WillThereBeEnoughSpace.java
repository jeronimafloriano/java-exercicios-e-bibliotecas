package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WillThereBeEnoughSpace {

    public static void main(String[] args) {
        WillThereBeEnoughSpaceTest.testBob();
    }

    /*
        cap é a quantidade de pessoas que o ônibus pode transportar, excluindo o motorista.
        on é o número de pessoas no ônibus excluindo o motorista.
        wait é o número de pessoas esperando para entrar no ônibus, excluindo o motorista.
        Se houver espaço suficiente, retorne 0, e se não houver, retorne o número de passageiros que ele não pode levar.
    */
    public static int enough(int cap, int on, int wait){
        int qtdEspacoRestante = cap - on;
        return  wait > qtdEspacoRestante ? (wait - qtdEspacoRestante) : 0;
        //return Math.max(0, on + wait - cap);
    }
}

class WillThereBeEnoughSpaceTest {
    @Test
    public static void testBob() {
        assertEquals("Should return 0.", 0, WillThereBeEnoughSpace.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, WillThereBeEnoughSpace.enough(100, 60, 50));
        assertEquals("Should return 0.", 0, WillThereBeEnoughSpace.enough(20, 5, 5));
    }
}