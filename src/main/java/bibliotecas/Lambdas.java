package bibliotecas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambdas {

    public static void main(String[] args) {
        /*List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Jeronima", 26));
        pessoas.add(new Pessoa("Mario", 18));
        pessoas.add(new Pessoa("Maria", 15));
        pessoas.add(new Pessoa("Juliana", 16));*/

        List<Pessoa> pessoas = Arrays.asList(new Pessoa("Jeronima", 26),
                new Pessoa("Mario", 18),
                new Pessoa("Maria", 15),
                new Pessoa("Juliana", 16));

        List<Pessoa> maiores = pessoas.stream()
                                    .filter(p -> p.idade >= 18)
                                    .collect(Collectors.toList());

        maiores.forEach(System.out::println);

    }

}


class Pessoa{
    String nome;
    Integer idade;

    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}