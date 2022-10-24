package apostila;

import java.util.Scanner;

public class TopN {

    /*
    Recentemente aconteceu a fase regional da Maratona de Programação da SBC, onde mais de 600 times participaram em mais de 40 sedes diferentes pelo Brasil. Seu amigo participou da competição, e quando questionado sobre sua colocação lhe disse: “Ficamos no top 10”.

    Você ficou feliz pelo seu amigo, mas não pode deixar de ficar curioso sobre qual foi sua real colocação. “Top 10” poderia indicar qualquer posição entre primeiro e décimo colocado, porém se ele estivesse em primeiro provavelmente teria dito “Top 1”, se estivesse em segundo ou terceiro provavelmente teria dito “Top 3”, e se estivesse em quarto ou quinto provavelmente teria dito “Top 5”. Logo, sua real colocação foi entre sexto e décimo, pois as pessoas geralmente se colocam na menor categoria a qual pertencem.

    Você reuniu então todas as categorias de colocações que as pessoas mais usam: 1, 3, 5, 10, 25, 50 e 100. Dada uma colocação K, diga o número da menor categoria que esta colocação pertence.
       */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer colocacao = scan.nextInt();

        int top1 = 1;
        int top3 = 3;
        int top5 = 5;
        int top10 = 10;
        int top25 = 25;
        int top50 = 50;
        int top100 = 100;

        if(colocacao == top1){
            System.out.println("Top " + top1);
        } else if (colocacao > top1 && colocacao <= top3) {
            System.out.println("Top " + top3);
        } else if (colocacao > top3 && colocacao <= top5) {
            System.out.println("Top " + top5);
        } else if (colocacao > top5 && colocacao <= top10) {
            System.out.println("Top " + top10);
        } else if (colocacao > top10 && colocacao <= top25) {
            System.out.println("Top " + top25);
        } else if (colocacao > top25 && colocacao <= top50) {
            System.out.println("Top " + top50);
        } else if (colocacao > top50 && colocacao <= top100) {
            System.out.println("Top " + top100);
        }
    }
}
