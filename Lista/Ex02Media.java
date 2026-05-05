package Lista;

import java.util.Scanner;

import Lista.ListaContigua;

public class Ex02Media {

    public static void main(String[] args) {

        ListaContigua lista = new ListaContigua();
        Scanner scanner = new Scanner(System.in);

        preencher(lista, scanner);

        double media = calcularMedia(lista);

        System.out.println("LISTA = " + lista);
        System.out.println("MEDIA = " + media);
    }

    private static void preencher(ListaContigua lista, Scanner scanner) {
        int quant, num;

        System.out.println("DIGITE A QUANTIDADE DE ELEMENTOS DA LISTA:");
        quant = scanner.nextInt();

        for (int i = 0; i < quant; i++) {
            num = (int) (Math.random() * 50) + 1;
            lista.add(num);
        }
    }

    private static double calcularMedia(ListaContigua lista) {
        int soma = 0;

        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);
        }

        return (double) soma / lista.size();
    }
}
