package pilhaFila;

import LSE.NoInt;

public class FilaLSEInt {
	private NoInt top;
	private int quant;
	/*
	 *
	 * remover do inicio
	 */
	//Construtor
	public FilaLSEInt () {
		this.quant=0;
		this.top=null;
	}

	//  retornar tamanho
	public int size() {
		return this.quant;
	}

	// retornar o topo
	public NoInt top() {
		return this.top;
	}

	// inserir no inicio -> EMPILHAR (push)
	public void push (int valor) {
		NoInt novo = new NoInt(valor);

		if (this.quant!=0) {
			novo.setProx(this.top);
		}
		this.top = novo;
		this.quant++;
	}

	// remover do inicio -> DESEMPILHAR (pop)
	public NoInt pop() {
		NoInt aux;
		if (this.quant==0) {
			return null;
		}
		aux = this.top;
		this.top = this.top.getProx();
		this.quant--;
		return aux;
	}
}

