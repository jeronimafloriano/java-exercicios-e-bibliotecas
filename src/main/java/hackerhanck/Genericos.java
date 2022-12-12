package hackerhanck;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Genericos {


    public void printArray(Object[] array) {
        Arrays.stream(array).forEach(a -> System.out.println(a));
    }
}


class SolutionOfGenericos {


    public static void main( String args[] ) {
        Genericos myPrinter = new Genericos();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Genericos.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
