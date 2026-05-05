package Lista;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos da lista 1: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite a quantidade de elementos da lista 2: ");
        int n2 = scanner.nextInt();

        ListaContigua lista1 = new ListaContigua(n1);
        ListaContigua lista2 = new ListaContigua(n2);

        for (int i = 0; i < n1; i++) {
            int num = (int) (Math.random() * 50);
            lista1.add(num);
        }

        for (int i = 0; i < n2; i++) {
            int num = (int) (Math.random() * 50);
            lista2.add(num);
        }

        System.out.println("\nLista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println();
        if (lista1.igual(lista2)) {
            System.out.println("As listas são iguais.");
        } else {
            System.out.println("As listas são diferentes.");
        }

        ListaContigua lista3 = lista1.concatena(lista2);
        System.out.println("\nLista 3 (concatenação de L1 com L2): " + lista3);

        ListaContigua lista4 = lista1.intersecao(lista2);
        System.out.println("\nLista 4 (interseção de L1 com L2): " + lista4);

        scanner.close();
    }
}
