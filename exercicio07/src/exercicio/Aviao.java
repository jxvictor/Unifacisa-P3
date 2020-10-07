 /**
     * Classe responsável por moldar os Aviões
     *
     * @author João Victor
     */


package exercicio;

public class Aviao {

	private String nome;
	private String marca;
	private int codigo;
	
	
	
	public Aviao(String nome, String marca, int codigo) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.codigo = codigo;
	}


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}


	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}


	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public void autorizacao(Aviao autorizacao) 
	{
		System.out.println("Autorizar a decolagem.");
		}


	@Override
	public String toString() {
		return this.getCodigo() + " - " + this.getNome() + " - " + this.getMarca();
		}
}