package bibliotecas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClassBigDecimal {

    //Se zero ou positivo, a escala é o número de dígitos à direita do ponto decimal.

    public static void main(String[] args) {
        double d = 3.945;
        BigDecimal bg = new BigDecimal(d);
        System.out.println("Criando um big decimal passando DOUBLE no construtor: " + bg);

        String teste = "1234";
        BigDecimal bg2 = new BigDecimal(teste);
        System.out.println("Criando um big decimal passando STRING no construtor: " + bg2);

        BigDecimal bg3 = new BigDecimal("100");
        BigDecimal bg4 = bg3.divide(BigDecimal.valueOf(3), 4, RoundingMode.HALF_UP);
        System.out.println("Dividindo passando uma escala de 4 (ponto após a vírgula) e arredondando " +
                " para o vizinho mais próximo ou para cima " + bg4);

        BigDecimal bg5 = bg3.divide(BigDecimal.valueOf(3), 0, RoundingMode.DOWN);
        System.out.println("Dividindo passando uma escala de 0 (ponto após a vírgula) e arredondando " +
                " para zero " + bg5);

        BigDecimal bg6 = bg3.divide(BigDecimal.valueOf(3), 0, RoundingMode.UP);
        System.out.println("Dividindo passando uma escala de 0 (ponto após a vírgula) e arredondando " +
                " para a partir de zero " +bg6);


        BigDecimal bg7 = new BigDecimal("0.345");
        System.out.println("Valor absoluto: " + bg7.abs());

        BigDecimal bg8 = bg7.add(new BigDecimal("1"));
        System.out.println("Adicionando valor: " + bg8);

        byte bg9 = bg3.byteValueExact();
        System.out.println("Convertendo em byte: " + bg9);

        System.out.println("Comparando valores, assumindo -1(menor que), 0(igual) ou 1(maior que): "
                + bg7.compareTo(bg8));
        System.out.println("Convertendo em um int: " + bg7.intValue());
        System.out.println("Convertendo em um int exato, nao aceita valores fracionados: " + bg3.intValueExact());
        System.out.println("Retorna valor máximo: " + bg8.max(bg3));

        System.out.println("O valor " + bg7 + " movendo 2 casas para esquerda: "
                + bg7.movePointLeft(2));
        System.out.println("O valor " + bg7 + " movendo 2 casas para direita: "
                + bg7.movePointRight(2));
        System.out.println("Negando o valor: " + bg7.negate());
        System.out.println("Multiplicando: " + bg3.multiply(new BigDecimal("5")));
        System.out.println("Potencia: " + bg3.pow(2));
        System.out.println("Precisao: " + bg7.precision());
        System.out.println("Retorna a escala desse big decimal: " + bg7.scale());
        System.out.println("Função signum: " + bg3.signum());
        System.out.println("Retorno o valor " + bg7 + " sem escalas: " + bg7.unscaledValue());
    }
}
