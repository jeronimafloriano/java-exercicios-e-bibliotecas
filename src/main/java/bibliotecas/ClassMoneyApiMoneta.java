package bibliotecas;

import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import java.util.Locale;

public class ClassMoneyApiMoneta {

    public static void main(String[] args) {

        MonetaryAmount money = Money.of(12345.67, "EUR");
        MonetaryAmountFormat formatacao = MonetaryFormats.getAmountFormat(Locale.getDefault());
        String euroFormatado = formatacao.format(money);

        System.out.println("Construindo money: " + money);
        System.out.println("Construindo money com formatação de pontuacao: " + euroFormatado);

        MonetaryAmount real = Money.of(100, "BRL");
        String realFormatado = formatacao.format(real);

        MonetaryAmount real2 = Money.of(200, "BRL");
        String real2Formatado = formatacao.format(real2);

        System.out.println("Somando: " + real.add(real2));
        System.out.println("Pegando a moeda: " + money.getCurrency());
        System.out.println("Representação numérica do valor : " + money.getNumber());
        System.out.println("Comparando valores: " + real.isGreaterThan(real2));
        System.out.println("Retorna resto da divisão de " + real + ": " + money.remainder(3));




    }
}
