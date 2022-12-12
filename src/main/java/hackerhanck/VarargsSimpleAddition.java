package hackerhanck;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class VarargsSimpleAddition {

    public void add(Integer...args){
        int soma = 0;
        StringBuilder c = new StringBuilder();

        for(int i = 0; i < args.length; i++){
            soma += args[i];
            c.append(args[i] + "+");
        }

        c.deleteCharAt(c.length()-1);
        System.out.println(c + "=" + soma);

    }
}


class SolutionVarargs {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());

            VarargsSimpleAddition ob = new VarargsSimpleAddition();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);

            Method[] methods = VarargsSimpleAddition.class.getDeclaredMethods();

            Set<String> set = new HashSet<>();
            boolean overload = false;

            for(int i = 0; i < methods.length; i++) {

                if(set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }

                set.add(methods[i].getName());

            }

            if(overload) {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
