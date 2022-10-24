package bibliotecas;

public class ClassNumbers {
    public static void main(String[] args) {

        Double d = 3.693;
        System.out.println(d.intValue());

        System.out.println(Integer.toString(65, 16));
        System.out.println(Integer.toHexString(65));
        System.out.println(Integer.valueOf("230", 5));
        System.out.println(Double.isNaN(2.3698));
        System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));

        Multiply.multiply(1,2);
    }
}

class Multiply {
    public static Double multiply(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }
}
