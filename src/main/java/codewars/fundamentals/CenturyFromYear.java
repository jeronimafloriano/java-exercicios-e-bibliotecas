package codewars.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CenturyFromYear {

    public static void main(String[] args) {
        CenturyTests.test();
    }
    public static int century(int ano){
        int century =  (ano + 99)/ 100;
        return century;
    }
}

class CenturyTests{

    @Test
    public static void test(){
        assertEquals(18, CenturyFromYear.century(1705));
        assertEquals(19, CenturyFromYear.century(1900));
        assertEquals(17, CenturyFromYear.century(1601));
        assertEquals(20, CenturyFromYear.century(2000));
    }
}
