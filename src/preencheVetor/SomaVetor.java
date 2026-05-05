package preencheVetor;

import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[11];
        for (int i = 1; i < vetor1.length; i++) {
            System.out.println(" O vetor [" + i + "] = ");
            vetor1[i] = scanner.nextInt();
        }
        System.out.println("Os valores dos vetores são");

        for (int i = 1; i < vetor1.length; i++) {
            System.out.println("O Vetor[" + i + "] = " + vetor1[i]);
        }
        scanner.close();
    }
}

