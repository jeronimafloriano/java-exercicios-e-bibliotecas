package bibliotecas;

public class ClassStringBuffer {

    public static void main(String[] args) {

        StringBuffer a = new StringBuffer("Maria");
        StringBuffer b = new StringBuffer("Marcos");


        System.out.println("Append: " + a.append(b));
        System.out.println("Capacity: " + a.capacity());
        System.out.println("CharAt: " + a.charAt(2));

        StringBuffer c = new StringBuffer();
        c.append(a.charAt(0)).append(".").append(b.charAt(0));
        System.out.println("APPEND: " + c);


        StringBuffer d = new StringBuffer("X.X");
        d.replace(0,1, String.valueOf(a.charAt(0)));
        d.replace(2,3,String.valueOf(b.charAt(0)));
        System.out.println("REPLACE: " + c);

        String teste = a.charAt(0) + "." + b.charAt(0);
        System.out.println("STRING: " + teste);

        System.out.println("codePointAt: " + a.	codePointAt(2));
        System.out.println("indexOf: " + a.indexOf("ri"));
        System.out.println("replace: " + a.replace(0,1, "XX"));
        System.out.println("reverse: " + a.reverse());
        System.out.println("delete: " + a.delete(0,1));

        System.out.println(b);
    }
}
