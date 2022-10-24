package hackerhanck.easy;

import java.util.*;
import java.util.stream.Collectors;

public class JavaMap {

    public static void main(String[] args) {

        Map<String, Integer> listaTelefonica = new LinkedHashMap<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < n; i++) {
            String name = scan.nextLine();
            Integer phone = scan.nextInt();
            scan.nextLine();
            listaTelefonica.put(name, phone);
        }

        while(scan.hasNext()){
            String s = scan.nextLine();

            if(listaTelefonica.get(s) != null){
                System.out.println(s + "=" + listaTelefonica.get(s));
            } else{
                System.out.println("Not found");
            }
        }


        //listaTelefonica.entrySet().stream().forEach(System.out::println);
    }
}
