package apostila;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ChuteNumero {
    /*
    Escreva um programa que, ao iniciar gera um valor aleatório de 1 a 10 e
    permite que o usuário chute um número até que o valor aleatório gerado
    no início do programa seja chutado corretamente.
     */

    public static void main(String[] args) {

        int valorAleatorio = new Random().nextInt(11);//definindo que o valor aleatório será até o 10

        if(valorAleatorio == 0){
            valorAleatorio = new Random().nextInt(11); //se o valor aleatório for 0, irá gerar outro número
        }

        int chute = valorAleatorio + 1; //definindo que o chute terá o valor inicial maior do que o valor aleatório gerado

        Scanner scanner = new Scanner(System.in);

        while (chute != valorAleatorio) { //enquanto o chute for diferente do valor aleatório...:
            chute = scanner.nextInt(); //chute recebe o valor digitado

            if (chute == valorAleatorio) {
                System.out.println("Acertou!");
            } else {
                if (chute < valorAleatorio) {
                    System.out.println("Valor abaixo do esperado.");
                } else if (chute > valorAleatorio) {
                    System.out.println("Valor acima do esperado.");
                }
            }
        }
    }
}
