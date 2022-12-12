package hackerhanck;

import java.util.ArrayList;
import java.util.Scanner;

class Student{}
class Rockstar{   }
class Hacker{}

public class Instanceof {
    static String count(ArrayList listaDeClasses){
        int a = 0, b = 0, c = 0;

        for(int i = 0; i < listaDeClasses.size(); i++){
            Object element = listaDeClasses.get(i);

            if(element instanceof Student) {
                a++;
            }
            if(element instanceof Rockstar){
                b++;
            }
            if(element instanceof Hacker){
                c++;
            }
        }

        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }

    public static void main(String []args){

        ArrayList listaDeClasses = new ArrayList();

        Scanner scan = new Scanner(System.in);
        int qtClasses = scan.nextInt();

        for(int i = 0; i < qtClasses; i++){
            String classe = scan.next();

            if(classe.equals("Student"))listaDeClasses.add(new Student());
            if(classe.equals("Rockstar"))listaDeClasses.add(new Rockstar());
            if(classe.equals("Hacker"))listaDeClasses.add(new Hacker());
        }

        System.out.println(count(listaDeClasses));
    }

}
