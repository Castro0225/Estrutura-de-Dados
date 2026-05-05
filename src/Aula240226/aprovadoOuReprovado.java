package Aula240226;

import java.util.Scanner;

/* comentario em java */
public class aprovadoOuReprovado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomeAluno = new String[5];
        double[] mediaAluno = new double[5];
        int[] faltasAluno = new int[5];

        for (int i = 0; i< 5; i++) {
            System.out.println("Qual o nome?");
            nomeAluno[i] = scanner.next();
            System.out.println("Qual sua media?");
            mediaAluno[i] = scanner.nextDouble();
            System.out.println("Quantas faltas esse aluno tem?");
            faltasAluno[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (faltasAluno[i] > 20 || mediaAluno[i] < 7) {
                System.out.println("O aluno " + nomeAluno[i] + " foi reprovado!");
            } else {
                System.out.println("O aluno " + nomeAluno[i] + " foi aprovado");
            }
        }
        scanner.close();
    }
}