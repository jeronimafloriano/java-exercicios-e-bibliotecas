package bibliotecas;

public class Wrappers {

    public static void main(String[] args) {
        /*
            char = Character
            boolean = Boolean
            long = Long
            int = Integer
            double = Double
            byte = Byte
            float = Float
            short = Short
         */

        Double d1 = Double.valueOf(2.53);

        //criar/converter uma string para um double primitivo
        double d2 = Double.parseDouble("2.53");

        //crar/converter uma string em um objeto Double
        Double d3 = Double.valueOf("2.53");
        System.out.format("Doubles: %.2f,  %.2f,  %.2f %n", d1, d2, d3);

        Boolean b1 = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf(true);
        Boolean b3 = Boolean.parseBoolean("true");
        Boolean b4 = Boolean.valueOf("TrUe");
        Boolean b5 = Boolean.parseBoolean("TRue");
        Boolean b6 = Boolean.valueOf(" true "); //escrevi com espaço, por isso vai ser false
        Boolean b7 = Boolean.parseBoolean(" true "); //escrevi com espaço, por isso vai ser false
        System.out.format("Criando e convertendo para Boolean: " +
                "%b - %b - %b - %b - %b - %b - %b %n", b1, b2, b3, b4, b5, b6, b7);

        boolean b8 = Boolean.valueOf("true");
        boolean b9 = Boolean.valueOf(true);
        boolean b10 = Boolean.parseBoolean("true");
        boolean b11 = Boolean.valueOf("TrUe");
        boolean b12 = Boolean.parseBoolean("TRue");
        boolean b13 = Boolean.valueOf(" true "); //escrevi com espaço, por isso vai ser false
        boolean b14 = Boolean.parseBoolean(" true "); //escrevi com espaço, por isso vai ser false
        System.out.format("Criando e convertendo para o primitivo boolean: " +
                "%b - %b - %b - %b - %b - %b - %b %n", b8, b9, b10, b11, b12, b13, b14);


        Long l1 = Long.valueOf(123);
        Long l2 = Long.valueOf("123");
        long l3 = Long.valueOf(123);
        long l4 = Long.valueOf("123");

        long l = l1.longValue();
        byte b = l1.byteValue();

        System.out.format("Longs: %d - %d - %d - %d %n", l1,l2,l3,l4);
        System.out.println("Convertendo Long para long: " + l);
        System.out.println("Convertendo Long para byte: " + b);
        System.out.println("Convertendo para string: " + Long.toString(123));

        int x = 1;
        int y = 1;
        System.out.println("AUTOBOXING:");
        Integer z = 1;
        Integer z2 = 1;
        Integer z3 = Integer.valueOf(1);
        Integer z4 = Integer.valueOf(1);
        System.out.println(x + y);
        System.out.println(z + z2);
        System.out.println(z3 + z4);
        System.out.println(++x);
        System.out.println(++z);
        System.out.println(++z3);

        int t = Integer.parseInt("10",2);
        System.out.println("valor de a: " + t);
        int n = t == 10 ? null : 3;
        System.out.println(t + n);

    }

}
