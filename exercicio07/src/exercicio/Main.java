package exercicio;

public class Main {
	public static void main(String[] args) {
		Controle controle = new Controle();

		System.out.println("Adicionando avião");
		controle.adicionar(new Aviao("Boeing 737-700","GOL", 123));
		controle.adicionar(new Aviao("Boeing 737-800","GOL", 456));
		controle.adicionar(new Aviao("Boeing 737 MAX 8","GOL", 789));
		controle.adicionar(new Aviao("Boeing 737 MAX 10","GOL", 1011));
		
		System.out.println("Número de aviões aguardando na fila de decolagem");
		controle.listar();
		
		System.out.println("Autorizando a decolagem do primeiro avião da fila");
		controle.autorizarDecolagem();
		
		System.out.println("Número de aviões aguardando na fila de decolagem");
		controle.listar();
		}
}
