public class Pilha {
    private final int[] vetor;
    private int topo;
    private int quantidade;
    private final int capacidade;

    public Pilha(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }

        this.capacidade = capacidade;
        this.vetor = new int[capacidade];
        this.topo = -1;
        this.quantidade = 0;
    }

    public void push(int valor) {
        if (isFull()) {
            throw new IllegalStateException("Pilha cheia. Nao e possivel inserir novos elementos.");
        }

        topo++;
        vetor[topo] = valor;
        quantidade++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia. Nao ha elementos para remover.");
        }

        int valorRemovido = vetor[topo];
        topo--;
        quantidade--;
        return valorRemovido;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia. Nao ha elemento no topo.");
        }

        return vetor[topo];
    }

    public boolean isEmpty() {
        return quantidade == 0;
    }

    public boolean isFull() {
        return quantidade == capacidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getCapacidade() {
        return capacidade;
    }
}
