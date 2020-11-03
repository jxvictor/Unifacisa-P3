package questoes0203;

public class Node {
	private Node direita;
	private Node esquerda;
	private int valor;
	
	/**
	 * @return the direita
	 */
	public Node getDireita() {
		return direita;
	}
	/**
	 * @param direita the direita to set
	 */
	public void setDireita(Node direita) {
		this.direita = direita;
	}
	/**
	 * @return the esquerda
	 */
	public Node getEsquerda() {
		return esquerda;
	}
	/**
	 * @param esquerda the esquerda to set
	 */
	public void setEsquerda(Node esquerda) {
		this.esquerda = esquerda;
	}
	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Node(int valor) {
		this.valor = valor;
		this.direita = null;
		this.esquerda = null;
	}
	public Node(Node esquerda, int valor, Node direita) {
		this.valor = valor;
		this.direita = null;
		this.esquerda = null;
	}
	public void setNull() {
		valor = 0;
		direita = null;
		esquerda = null;
	}
}