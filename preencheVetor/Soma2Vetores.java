package preencheVetor;

import java.util.Scanner;

public class Soma2Vetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetorSoma = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite os valores do vetor " +i+" =");
            vetor1[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Digite os valores do vetor " + i + "=");
            vetor2[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        for (int i = 0; i <vetorSoma.length;i++){
            System.out.println("A soma dos vetores " +i+ " é "+vetorSoma[i]);
        }
        scanner.close();
    }
}
