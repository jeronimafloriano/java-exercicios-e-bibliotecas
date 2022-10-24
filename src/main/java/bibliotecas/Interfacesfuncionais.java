package bibliotecas;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Function;
import java.util.function.Predicate;


public class Interfacesfuncionais implements Predicate{

    public static void main(String[] args) {
        List<String> teste = new ArrayList<>();
        teste.add("Jeronima");

        teste.forEach(c -> {
            System.out.println("Teste Consumer - aceita apenas um argumento e sem valor de retorno.");
        });

        Interfacesfuncionais p = new Interfacesfuncionais();
        System.out.println("Predicate - aceita um único argumento e retorno booleano: "
                + p.test(teste.get(0)));


        Function f = new Function<Object, String>() {
            @Override
            public String apply(Object t) {
                return "Teste Function - Recebe um argumento e retorna um valor";
            }
        };

        System.out.println(f.apply("teste"));
    }

    @Override
    public boolean test(Object o) {
        return o == null;
    }
}
