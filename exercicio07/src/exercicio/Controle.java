 /**
     * Classe respons�vel pelos m�todos
     *
     * @author Jo�o Victor
     */



package exercicio;

import java.util.LinkedList;
import java.util.Queue;

public class Controle {
	private final Queue<Aviao> espera = new LinkedList<>();

	public void listar() 
	{
	    this.espera.forEach(a -> System.out.println(a));
	    }

	public void listarPrimeiro() 
	{
		this.espera.element();
		}

	public void adicionar(Aviao aviao) 
	{
		System.out.println(aviao);
		this.espera.add(aviao);
		}

	public Aviao autorizarDecolagem() 
	{

		Aviao aviao;
		aviao = this.espera.remove();
		System.out.println(aviao);
		return aviao;
		}

}
