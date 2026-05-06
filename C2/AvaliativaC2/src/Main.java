public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo atual: " + pilha.top());
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Topo apos pop: " + pilha.top());
        System.out.println("Pilha vazia? " + pilha.isEmpty());
        System.out.println("Pilha cheia? " + pilha.isFull());
    }
}
