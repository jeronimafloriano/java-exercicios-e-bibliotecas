package hackerhanck.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArraySecond {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));



        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6)
                .forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine()
                                        .replaceAll("\\s+$", "")
                                        .split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        System.out.println(arr);

        for (int i = 0; i < 6; i++){
            List<Integer> lista = arr.get(i);


        }


    }
}
