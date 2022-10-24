package bibliotecas;

public class ImpressaoNoJava {

    public static void main(String[] args) {

        /*
        System.out.format e System.out.printf fazem a mesma coisa.
        Regras do que passar no System.out.format:
        - Na ordem: percente, índice, flags, tamanho, precisão e tipo.
        Somente o percente e o tipo são obrigatórios, demais parâmetros são opcionais.
       */

        /*
            O out é um atributo estático e público da classe System, do tipo PrintStream.
            A classe PrintStream possui vários métodos que permitem escrever diversos tipos
            de dados de maneira padronizada em um OutputStream.

            %s -> String
            %b -> booleano
            %c -> caractere
            %d -> inteiro
            %f -> ponto flutuante
            %n -> quebra de linha
         */

        System.out.print("Criando e imprimindo um array de inteiros: ");
        System.out.println( new int [10]);
        System.out.print("Criando e imprimindo um array de char: ");
        System.out.println(new char[10]); //tem o toString sobrescrito, já  imprime o valor
        System.out.print("Criando e imprimindo um array de String: ");
        System.out.println(new String[]{"abc"});

        int [] a = {1, 2, 3};
        char [] b = {'a', 'b','c'};
        System.out.println(a);
        System.out.println(b);

        System.out.format("Imprimindo uma %s, um valor booleano %b, " +
                "um caractere '%c', um número inteiro %d, um ponto flutuante %f e uma " +
                "quebra de linha. %n", "String", true, 'x', 25, 2.5963);

        System.out.format("Ponto flutuante formatado com 4 casas decimais : %.4f %n", 2.5963);

        System.out.format("Sem controlar a ordem de exibição: %s, %s %n", "Segundo lugar", "Primeiro lugar");
        System.out.format("Controlando a ordem de exibição: %2$s, %1$s %n", "Segundo lugar", "Primeiro lugar");

        System.out.format("Definindo um tamanho mínimo para o que vamos imprimir: %4d %n", 2);
        System.out.format("Pedindo para exibir o sinal positivo/negativo do nº: %+1d, %+1d %n", 2, -2);
        System.out.format("Pedindo para exibir os negativos em parênteses: %+(1d, %+(1d  %n", -2 , 2);

        System.out.format("Alinhar na esquerda ao invés de direita: [%-5d], [%-5s] %n", 2, "Jeje");
        System.out.format("Alinhar na esquerda e preencher com zero: [%05d] %n", 2);
        System.out.format("Separando por milhar: %,d %n", 2589);

        System.out.format("Definindo que será completado com zeros á esquerda, " +
                "com separador de milhar, no mínimo 8 casas decimais" +
                "(a vírgula do separador de milhar conta), %n" +
                "com 2 casas decimais(caso necessário o valor é arredondado): " +
                "de 34.589 fica %0,8.2f %n", 34.589);

        System.out.printf(">%-(8.2f< %n",12.45);
        System.out.printf(">%0,8.2f< %n",12.45);





    }
}
