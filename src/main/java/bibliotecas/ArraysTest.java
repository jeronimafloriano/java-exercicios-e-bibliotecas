package bibliotecas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {

        String [] nomes = {"Jeronima", "Maria", "João", "Paulo", "Jose", "Bernardo", "Lucas"};
        String [] copia = new String[4];

        System.arraycopy(nomes, 1, copia, 1, 2);

        System.out.println("Copiando um array para outro com System.arraycopy:");
        for(String nome : copia){
            System.out.println(nome);
        }


        String[] copiaComArrays = Arrays.copyOfRange(nomes, 1, 3);

        System.out.println("Copiando um array para outro com Arrays.copyOfRange:");
        Arrays.stream(copiaComArrays).forEach(System.out::println);

        Arrays.stream(Arrays.copyOf(nomes, 6))
                .map(c -> "Copiando e especificando um tamanho para novo array: " + c)
                .forEach(System.out::println);

        System.out.println("-----------------------------------");

        System.out.println("Substituindo todos valores de um array por outro valor:");

        int [] i = {1,2,3};
        Arrays.fill(i, 5);
        Arrays.stream(i).forEach(System.out::println);

        Arrays.fill(i, 1, 3, 4);
        System.out.println("Substituindo os valores de um array por outro valor, a partir de um índice determinado:");
        Arrays.stream(i).forEach(System.out::println);


        System.out.println("-----------------------------------");

        System.out.println("Ordenando  array a partir de um índice. Antes x Depois:");
        Arrays.stream(nomes).forEach(System.out::println);
        Arrays.sort(nomes, 2, 6);
        System.out.println("   DEPOIS  :");
        Arrays.stream(nomes).forEach(System.out::println);

        System.out.println("-----------------------------------");

        int [] x = {1,2,3,4};
        int [] y = {1,2,3,4,5};
        int [] z = {1,2,3,4,5};
        var a = Arrays.compare(y, z);
        var b = Arrays.compare(x, y);
        var c = Arrays.compare(y,x);
        System.out.println("o valor 0 se o primeiro e o segundo array" +
                " forem iguais e contiverem os mesmos elementos na mesma ordem: " + a);

        System.out.println("um valor menor que 0 se a primeira matriz for " +
                "lexicograficamente menor que a segunda matriz: " + b);

        System.out.println("um valor maior que 0 se a primeira matriz for " +
                "lexicograficamente maior que a segunda matriz: " + c);

        System.out.println("-----------------------------------");
        var o = Arrays.stream(x).mapToObj(t -> (Object) t);
        String transformandoArrayEmString = Arrays.deepToString(o.toArray());
        System.out.println("Transformando Array em String: " + transformandoArrayEmString);

        System.out.println("-----------------------------------");

        int incompatibilidade = Arrays.mismatch(x,y);
        System.out.println("Localiza e retorna o índice do primeiro elemento sem correspondência entre " +
                "as duas matrizes especificadas: " + incompatibilidade);






    }
}
