public class Fila {
    private final int[] vetor;
    private int inicio;
    private int fim;
    private int quantidade;
    private final int capacidade;

    public Fila(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }

        this.capacidade = capacidade;
        this.vetor = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.quantidade = 0;
    }

    public void enqueue(int valor) {
        if (isFull()) {
            throw new IllegalStateException("Fila cheia. Nao e possivel inserir novos elementos.");
        }

        fim = (fim + 1) % capacidade;
        vetor[fim] = valor;
        quantidade++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia. Nao ha elementos para remover.");
        }

        int valorRemovido = vetor[inicio];
        inicio = (inicio + 1) % capacidade;
        quantidade--;
        return valorRemovido;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia. Nao ha elemento no inicio.");
        }

        return vetor[inicio];
    }

    public boolean isEmpty() {
        return quantidade == 0;
    }

    public boolean isFull() {
        return quantidade == capacidade;
    }
}
