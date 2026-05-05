package LSE;

public class TesteLSE {
    public static void main(String[] args) {

        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();

        lista.addFirst(20);
        lista.addFirst(10);
        lista.addLast(30);
        lista.addLast(40);

        System.out.println("Lista: " + lista);
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Está vazia? " + lista.isEmpty());

        System.out.println("Posição do 30: " + lista.search(30));
        System.out.println("Elemento da posição 2: " + lista.get(2));

        System.out.println("Removendo primeiro: " + lista.removeFirst());
        System.out.println("Lista agora: " + lista);

        System.out.println("Removendo último: " + lista.removeLast());
        System.out.println("Lista agora: " + lista);

        System.out.println("Removendo valor 20: " + lista.remove(20));
        System.out.println("Lista final: " + lista);
    }
}