package bibliotecas;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;

public class PackageJavaTime {

    /*
        LocalDate = Data sem hora
        LocalTime = Hora
        LocalDateTime = Data com hora
        MonthDay = Dia de um mês, independente do ano
        YearMonth = Mês e ano
     */


    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDate data2 = LocalDate.of(2022, 01, 10);
        LocalDate data3 = LocalDate.of(2022, Month.APRIL, MonthDay.now().getDayOfMonth());
        LocalDate data4 = LocalDate.now(ZoneId.of("Europe/London"));

        System.out.println("Data atual: " + data);
        System.out.println("Data criada: " + data2);
        System.out.println("Data criada com Enums de Month e MonthDay: " + data3);
        System.out.println("Data criada passando ZoneId de Londres: " + data4);

        System.out.println("-----------------------------------------------");

        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.of(10, 00);
        LocalTime time3 = LocalTime.now(ZoneId.of("Europe/London"));
        LocalTime time4 = LocalTime.now(ZoneId.of("Brazil/West"));

        System.out.println("Hora atual: " + time);
        System.out.println("Hora criada com hora e minuto: " + time2);
        System.out.println("Hora criada passando ZoneId de Manaus: " + time3);

        System.out.println("-----------------------------------------------");

        LocalDateTime dataHora = LocalDateTime.now();
        LocalDateTime dataHora2 = LocalDateTime.of(2022,12,25,00,01,0);
        LocalDateTime dataHora3 = LocalDateTime.of(data, time2);
        LocalDateTime dataHora4 = LocalDateTime.of(2022,Month.AUGUST,10,12,00);

        System.out.println("Data e hora atual: " + dataHora);
        System.out.println("Data e hora criadas(NATAL!!!): " + dataHora2);
        System.out.println("Data e hora criadas passando um LocalDate e LocalTime: " + dataHora3);
        System.out.println("Data e hora atual utilizando enum Month para o mês: " + dataHora4);

        System.out.println("-----------------------------------------------");

        MonthDay monthDay = MonthDay.of(12,27);
        Year year = Year.of(2022);



        System.out.println("Meu aniversário com MonthDay e Year: " + monthDay.getDayOfMonth()
                + monthDay.getMonth() + year);

        System.out.println("Pegando o mês de uma data com ChronoFiel: " + dataHora2.get(ChronoField.MONTH_OF_YEAR));

        System.out.println("Comparando se um dia do mês " + monthDay.getMonth()
                + " vem antes de outro: " +
                monthDay.isBefore(MonthDay.of(dataHora2.getMonth(), dataHora2.getDayOfMonth())));

        System.out.println("Comparando se um dia do mês " + monthDay.getMonth()
                + " vem depois de outro: " +
                monthDay.isAfter(MonthDay.of(dataHora2.getMonth(), dataHora2.getDayOfMonth())));

        System.out.println("Alterando(criando uma nova) a data " + data2
                + " para o dia 5 com o método with(): "
                + data2.withDayOfYear(5));

        System.out.println("Alterando(criando uma nova) a data " + data
                + " para o ano 2023 com o método with(): "
                + data.withYear(2023));

        LocalDate dataAdicionada = data.plusDays(5).plusMonths(2).plusYears(1);
        System.out.println("Adicionando 5 dias, 2 meses e 1 ano a partir da data "+ data
                + ": "
                + dataAdicionada);

        System.out.println("Que dia da semana será o dia " + dataAdicionada + " ?: "
        + dataAdicionada.getDayOfWeek());

        System.out.println("O que acontece se adicionar dias suficiente que ultrapassem um mês?"
        + " pegando a data " + dataHora2 + " e adicionando 15 dias e 1 mês: "
        + dataHora2.plusDays(15).plusMonths(1));

        System.out.println("Diminuindo 1 ano na data " + dataAdicionada
                + " : " + dataAdicionada.minusYears(1));

        System.out.println("-----------------------------------------------");

        LocalTime horaExtraida = dataHora2.toLocalTime();
        LocalDate dataExtraida =  dataHora2.toLocalDate();
        LocalDateTime agrupandoDataEHora = dataExtraida.atTime(horaExtraida);

        System.out.println("Extraindo hora de data e hora " + dataHora2 + " : " + horaExtraida);
        System.out.println("Extraindo data de data e hora " + dataHora2 + " : " + dataExtraida);
        System.out.println("Agrupando data "+ dataExtraida + " e hora " + horaExtraida + " : " + agrupandoDataEHora);

        System.out.println("-----------------------------------------------");

        Date date = new Date();
        Instant instant = date.toInstant();
        LocalDateTime dataHoraConversao = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        LocalDate dataConversao = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        /*
            ou:
            LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalDate()
         */

        System.out.println("Convertendo um Date " + date + " para um LocalDateTime: " + dataHoraConversao);
        System.out.println("Convertendo um Date " + date + " para um LocalDate: " + dataConversao);

        Calendar calendario = Calendar.getInstance();
        Instant instante2 = calendario.toInstant();
        LocalDateTime dataHoraCalendar = LocalDateTime.ofInstant(instante2, ZoneId.systemDefault());

        System.out.println("Convertendo um Calendar " + calendario.getTime()
                + " para um LocalDateTime: " + dataHoraCalendar);

        Instant instante3 = dataHoraCalendar.toInstant(ZoneOffset.UTC);
        Date dateConvertido = Date.from(instante3);

        System.out.println("Convertendo data e hora " + dataHoraCalendar
                + " para Date: " + dateConvertido);

        System.out.println("-----------------------------------------------");

        System.out.println("Instante atual: " + Instant.now());

        long duracao = Duration.between(Instant.EPOCH, Instant.now()).getSeconds();

        System.out.println("Duration: Duração entre o instante inicial da classe INSTANT " +
                "e o instante atual: " + duracao);

        System.out.println("-----------------------------------------------");

        LocalDate dataAtual = LocalDate.now();
        LocalDate meuNascimento  = LocalDate.of(1996,12,27);
        long years = ChronoUnit.YEARS.between(meuNascimento, dataAtual);
        long meses = ChronoUnit.MONTHS.between(meuNascimento, dataAtual);
        long dias = ChronoUnit.DAYS.between(meuNascimento, dataAtual);

        System.out.println("ChronoUnit: Desde que eu nasci se passaram: " + dias + " dias, "
        + meses + " meses e " + years + " anos.");



        LocalDate andrey = LocalDate.of(1986, 07, 24);
        long years2 = ChronoUnit.YEARS.between(andrey, dataAtual);
        long meses2 = ChronoUnit.MONTHS.between(andrey, dataAtual);
        long dias2 = ChronoUnit.DAYS.between(andrey, dataAtual);
        System.out.println("ChronoUnit: Desde que o Andrey nasceu se passaram: " + dias2 + " dias, "
                + meses2 + " meses e " + years2 + " anos.");

        System.out.println("-----------------------------------------------");

        Period p = Period.between(meuNascimento,LocalDate.now());
        System.out.println("Period: Período entre meu nascimento e a data atual: " + p);
        System.out.println("No total se passaram: " + p.getYears() + " anos, "
        + p.getMonths() + " meses e " + p.getDays() + " dias.");


        System.out.println("-----------------------------------------------");

        LocalDate dataASerFormatada = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data sem formatação: " + dataASerFormatada);
        System.out.println("Data com DateTimeFormatter: " + formatter.format(dataASerFormatada));
        System.out.println("Data com LocalDate chamando o DateTimeFormatter: "
                + dataASerFormatada.format(formatter));


        System.out.println("------------------------------------");

        System.out.println(YearMonth.now().isSupported(ChronoField.DAY_OF_MONTH));
        System.out.println(YearMonth.now().isSupported(ChronoUnit.MONTHS));
        System.out.println(MonthDay.now().isSupported(ChronoField.DAY_OF_MONTH));
        System.out.println(LocalDate.now().isSupported(ChronoUnit.DAYS));
        System.out.println(LocalDateTime.now().isSupported(ChronoField.DAY_OF_MONTH));

    }
}


