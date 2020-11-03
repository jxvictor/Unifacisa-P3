package questoes0203;

public class ArvoreBinaria {
	private static class No {
		int value;
		No esquerda;
		No direita;
		No pai;
	}
	private No raiz;
	private int tamanho = 0;
	private int soma = 0;
	private int folhas = 0;
	
	
	public int getNumeroDeNos() {
		return tamanho;
	}

	public int getsomaDosNos() {
		return somaDosNos(raiz);
	}

	private int somaDosNos(No no) {
		if (no != null) {
			somaDosNos(no.esquerda);
			somaDosNos(no.direita);
			soma += no.value;
		}
		return soma;
	}

	public void emOrdem(Node no) {
		if(no != null) {
			emOrdem(no.getEsquerda());
			System.out.print(no.getValor() + " ");
			emOrdem(no.getDireita());
		}
	}
	public void preOrdem(Node no) {
		if(no != null) {
			System.out.print(no.getValor() + " ");
			emOrdem(no.getEsquerda());
			emOrdem(no.getDireita());
		}
	}
	public void posOrdem(Node no) {
		if(no != null) {
			emOrdem(no.getEsquerda());
			emOrdem(no.getDireita());
			System.out.print(no.getValor() + " ");
		}
	}

	public int getQuantidadeDeFolhas() {
		return contadorDeNoFolhas(raiz);
	}

	private int contadorDeNoFolhas(No no) {
		if (no != null) {
			contadorDeNoFolhas(no.esquerda);
			contadorDeNoFolhas(no.direita);
			if (no.esquerda == null && no.direita == null) {
				folhas++;
			}
		}
		return folhas;
	}
	
	private No encontrarNo(int valor) {
		No atual = raiz;
		while (atual.value != valor)
        {
            if (valor <= atual.value){
            	atual = atual.esquerda;
            } else {
            	atual = atual.direita;
            }
            if(atual == null) {
            	return null;
            }
        }
		return atual;
	}
	
	public void remover(int valor) {
		No no = encontrarNo(valor);
		if (no != null) {
			if (isFolha(no)) {
				removeNo(no);
			} else {
				No atual = no;					
				if (no.esquerda != null) {
					atual = atual.esquerda;
					while (atual.direita != null) {
						atual = atual.direita;
					}
				} else {					
					atual = atual.direita;
					while (atual.esquerda != null) {
						atual = atual.esquerda;
					}
				}
				removeNo(atual);
				no.value = atual.value;
			}
		}
	}

	private void removeNo(No no) {
		if(no.value > no.pai.value)
			no.pai.direita = null;
		else
			no.pai.esquerda = null;

	}

	private boolean isFolha(No no) {
		return no.esquerda == null && no.direita == null ? true : false;
	}
}
