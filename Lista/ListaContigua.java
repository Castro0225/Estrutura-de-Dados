package Lista;

public class ListaContigua {
	// atributos
	private Integer[] vetor;
	private int quant;

	// METODOS
	public ListaContigua (int tam) {
		this.vetor = new Integer[tam];
		this.quant = 0;
	}
	
	public ListaContigua () {
		this.vetor = new Integer[10];
		this.quant = 0;
	}

	public int size() {
		return quant;
	}

	public boolean isEmpty () {
		if (quant == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull () {
		if (quant == this.vetor.length) {
			return true;
		}
		return false;
	}

	public Integer get (int posicao) {
		if (posicao<0 || posicao>=quant) {
			return null;
		}
		return this.vetor[posicao];
	}

	private Integer[] increase() {
		Integer[] vetorNovo = new Integer[quant*2];
		
		for (int i=0; i<quant; i++) {
			vetorNovo[i] = this.vetor[i];
		}
		return vetorNovo;
	}
	
	public void add (Integer num) {
		if (this.isFull()) {
			this.vetor = increase();
		}
		this.vetor[quant] = num;
		quant++;
	}

	public boolean add (Integer num, int posicao) {
		if (posicao<0 || posicao>quant) {
			return false;
		} else {
			if (this.isFull()) {
				this.vetor = increase();
			}
			for (int i=quant-1; i<=posicao; i--) {
				this.vetor[i+1] = this.vetor[i];
			}
			this.vetor[posicao] = num;
			return true;
		}
	}
	
	public boolean addFirst (Integer num) {
		return add (num, 0);
	}
	
	public Integer remove (int posicao) {
		int aux;
		
		if (posicao<0 || posicao>=quant) {
			return null;
		} else {
			aux = this.vetor[posicao];
			for (int i=posicao+1; i<quant; i++) {
				this.vetor[i-1] = this.vetor[i];
			}
			quant--;
			this.vetor[quant] = null;
			return aux;
		}
	}
	
	public String toString () {
		String aux = "| ";
		for (int i=0; i<quant; i++) {
			aux += this.vetor[i]+" | ";
		}
		return aux;
	}

    public ListaContigua concatena(ListaContigua outra) {

        // cria nova lista com capacidade suficiente
        ListaContigua nova = new ListaContigua(this.quant + outra.quant);
        // copia elementos da lista atual
        for (int i = 0; i < this.quant; i++) {
            nova.add(this.vetor[i]);
        }

        // copia elementos da outra lista
        for (int i = 0; i < outra.quant; i++) {
            nova.add(outra.vetor[i]);
        }
        return nova;
    }
    public boolean igual(ListaContigua outra) {

        if (this.quant != outra.quant) {
            return false;
        }

        for (int i = 0; i < this.quant; i++) {
            if (!this.vetor[i].equals(outra.vetor[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean pertencer(Integer num) {

        for (int i = 0; i < quant; i++) {
            if (this.vetor[i].equals(num)) {
                return true;
            }
        }
        return false;
    }

    public ListaContigua intersecao(ListaContigua outra) {

        ListaContigua nova = new ListaContigua();

        for (int i = 0; i < this.quant; i++) {
            Integer valor = this.vetor[i];

            if (outra.pertencer(valor)) {
                nova.add(valor);
            }
        }
        return nova;
    }


}