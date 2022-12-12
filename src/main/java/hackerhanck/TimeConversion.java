package hackerhanck;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) throws ParseException {
        DateFormat formatacao = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

        Date date = formatacao.parse(s);

        String output = outputFormat.format(date);

        return output;

    }

        public static void main(String[] args) throws IOException, ParseException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(("filewriter.txt")));

            String s = bufferedReader.readLine();

            String result  = timeConversion(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }

}

