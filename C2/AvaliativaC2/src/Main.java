public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Primeiro da fila: " + fila.peek());
        System.out.println("Elemento removido: " + fila.dequeue());
        System.out.println("Primeiro apos dequeue: " + fila.peek());
        System.out.println("Fila vazia? " + fila.isEmpty());
        System.out.println("Fila cheia? " + fila.isFull());
    }
}
