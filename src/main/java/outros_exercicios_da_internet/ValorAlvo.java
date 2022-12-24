package outros_exercicios_da_internet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
    Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
    do array em que a sua diferença seja igual ao valor alvo.
    Exemplo de entrada:
    5 2
    1 5 3 4 2
    Saída = 3
 */

public class ValorAlvo {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int sum = 0;

        Integer tamanho = scan.nextInt();
        Integer alvo = scan.nextInt();

        for (int i = 0; i < tamanho; i++){
            Integer valor = scan.nextInt();
            numeros.add(valor);
        }

        for (int i = 0; i < numeros.size(); i++){
            var valorASubtrair = numeros.get(i);
            for (int j = 0; j < numeros.size(); j++){
                int i1 = valorASubtrair - numeros.get(j);
                if(i1 == alvo){
                    sum++;
                }
            }
        }

        System.out.println(sum);

    }
}
