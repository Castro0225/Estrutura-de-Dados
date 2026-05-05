package LSE;

public class ListaSimplesmenteEncadeada {

    private NoInt inicio;
    private int quant;

    public ListaSimplesmenteEncadeada() {
        this.inicio = null;
        this.quant = 0;
    }

    public int size() {
        return quant;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void addFirst(int valor) {
        NoInt novo = new NoInt(valor);
        novo.setProx(inicio);
        inicio = novo;
        quant++;
    }

    public void addLast(int valor) {
        NoInt novo = new NoInt(valor);

        if (isEmpty()) {
            inicio = novo;
        } else {
            NoInt atual = inicio;

            while (atual.getProx() != null) {
                atual = atual.getProx();
            }

            atual.setProx(novo);
        }

        quant++;
    }

    public int search(int valor) {
        NoInt atual = inicio;
        int posicao = 0;

        while (atual != null) {
            if (atual.getValor() == valor) {
                return posicao;
            }
            atual = atual.getProx();
            posicao++;
        }

        return -1;
    }

    public Integer get(int posicao) {
        if (posicao < 0 || posicao >= quant) {
            return null;
        }

        NoInt atual = inicio;
        int contador = 0;

        while (contador < posicao) {
            atual = atual.getProx();
            contador++;
        }

        return atual.getValor();
    }

    public Integer removeFirst() {
        if (isEmpty()) {
            return null;
        }

        int valorRemovido = inicio.getValor();
        inicio = inicio.getProx();
        quant--;

        return valorRemovido;
    }

    public Integer removeLast() {
        if (isEmpty()) {
            return null;
        }

        if (inicio.getProx() == null) {
            int valorRemovido = inicio.getValor();
            inicio = null;
            quant--;
            return valorRemovido;
        }

        NoInt atual = inicio;

        while (atual.getProx().getProx() != null) {
            atual = atual.getProx();
        }

        int valorRemovido = atual.getProx().getValor();
        atual.setProx(null);
        quant--;

        return valorRemovido;
    }

    public boolean remove(int valor) {
        if (isEmpty()) {
            return false;
        }

        if (inicio.getValor() == valor) {
            inicio = inicio.getProx();
            quant--;
            return true;
        }

        NoInt atual = inicio;

        while (atual.getProx() != null) {
            if (atual.getProx().getValor() == valor) {
                atual.setProx(atual.getProx().getProx());
                quant--;
                return true;
            }
            atual = atual.getProx();
        }

        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        String resultado = "[";
        NoInt atual = inicio;

        while (atual != null) {
            resultado += atual.getValor();

            if (atual.getProx() != null) {
                resultado += ", ";
            }

            atual = atual.getProx();
        }

        resultado += "]";
        return resultado;
    }
}