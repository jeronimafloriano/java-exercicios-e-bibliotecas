package bibliotecas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClassCalendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        var a = calendar.getFirstDayOfWeek();
        System.out.println("Primeiro dia da semana default: " + a);
        calendar.setFirstDayOfWeek(1);
        System.out.println("Primeiro dia da semana após alterar: " +calendar.getFirstDayOfWeek());
        System.out.println("Pegando a hora atual: " +calendar.getTime());
        System.out.println("Time zone atual: " + calendar.getTimeZone());
        System.out.println("Pegando a era: " + calendar.get(Calendar.ERA));
        System.out.println("Pegando o minuto: " + calendar.get(Calendar.MINUTE));
        System.out.println("Maximo de dias na semana: " + calendar.getMaximum(Calendar.DAY_OF_WEEK));

        calendar.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + calendar.getTime());

        calendar.add(Calendar.MONTH, 3);
        System.out.println("3 meses depois: " + calendar.getTime());

        Calendar calendar2 = new GregorianCalendar(2022,Calendar.DECEMBER, 27);
        System.out.println("Calendário que criei: " + calendar2.getTime());
        System.out.println("Dia do calendário que criei: " + calendar2.get(Calendar.DATE));

        System.out.println(calendar2.getTime() + " é depois de "
                + calendar.getTime() + " ? : " + calendar2.after(calendar));

        System.out.println(calendar2.getTime() + " é antes de "
                + calendar.getTime() + " ? : " + calendar2.before(calendar));

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Calendário que criei formatado: " + formatador.format(calendar2.getTime()));



    }
}
