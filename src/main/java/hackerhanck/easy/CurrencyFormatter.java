package hackerhanck.easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String formatChina = china.format(payment);

        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String formatIndia = india.format(payment);

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        String formatUs = us.format(payment);

        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String formatFrance = france.format(payment);


        System.out.println("US: " + formatUs);
        System.out.println("India: " + formatIndia);
        System.out.println("China: " + formatChina);
        System.out.println("France: " + formatFrance);
    }

}
