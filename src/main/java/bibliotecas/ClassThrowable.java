package bibliotecas;

import java.util.Scanner;

public class ClassThrowable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);

        } catch (Throwable e) {
            System.out.println("TO STRING DO THROW: "+ e);
            System.out.println("PEGANDO NOME DA CLASSE THROW: "+ e.getClass().getName());
            System.out.println("PEGANDO A MENSAGEM DO THROW: "+ e.getMessage());
            System.out.println("RETORNA A CAUSA DO THROW OU NULL SE DESCONHECIDA: "+ e.getCause());
            System.out.println("RETORNA MATRIZ COM TODAS EXCEÇÕES: "+ e.getSuppressed().toString());
            System.out.println("ACESSO AS INFORMAÇÕES DO PRINTSTACKTRACE: "+ e.getStackTrace().length);
            System.out.println("LOCALIZAÇÃO: " + e.getLocalizedMessage());
            Throwable throwable = new Throwable("Construindo um throwable", e);
            System.out.println("CONSTRUINDO UM THROWABLE: " + throwable);
            System.out.println("--------------------------------");
            System.out.println("TO STRING DO THROW: "+ throwable);
            System.out.println("PEGANDO NOME DA CLASSE THROW: "+ throwable.getClass().getName());
            System.out.println("PEGANDO A MENSAGEM DO THROW: "+ throwable.getMessage());
            System.out.println("RETORNA A CAUSA DO THROW OU NULL SE DESCONHECIDA: "+ throwable.getCause());
            System.out.println("RETORNA MATRIZ COM TODAS EXCEÇÕES: "+ throwable.getSuppressed().toString());
            System.out.println("ACESSO AS INFORMAÇÕES DO PRINTSTACKTRACE: "+ throwable.getStackTrace().length);
            System.out.println("LOCALIZAÇÃO: " + throwable.getLocalizedMessage());
        }

    }
}
