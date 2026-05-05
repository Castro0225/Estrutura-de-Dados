package Lista;

import java.util.Scanner;

public class Ex01Maior {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ListaContigua lista = new ListaContigua();
        int maior;

        preencher(lista);

        maior = maior(lista);

        System.out.println("LISTA = " + lista);
        System.out.println("MAIOR = " + maior);
    }

    private static void preencher(ListaContigua lista) {
        int quant, num;

        System.out.println("DIGITE A QUANTIDADE DE ELEMENTOS DA LISTA:");
        quant = scanner.nextInt();

        for (int i = 0; i < quant; i++) {
            num = (int) (Math.random() * 50) + 1;
            lista.add(num);
        }
    }

    private static int maior(ListaContigua lista) {

        int maior = lista.get(0);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > maior) {
                maior = lista.get(i);
            }
        }

        return maior;
    }
}