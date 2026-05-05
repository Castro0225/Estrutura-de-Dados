package LSE;

public class NoInt {
    private int valor;
    private NoInt prox;

    public NoInt(int valor) {
        this.valor = valor;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public NoInt getProx() {
        return prox;
    }

    public void setProx(NoInt prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "NoInt{valor=" + valor + "}";
    }
}