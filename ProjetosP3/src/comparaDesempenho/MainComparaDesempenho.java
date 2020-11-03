package comparaDesempenho;

public class MainComparaDesempenho {

	public static void main(String[] args) {
		VerificaDesempenhoHashSet hashSet = new VerificaDesempenhoHashSet();
		VerificaDesempenhoTreeSet treeSet = new VerificaDesempenhoTreeSet();
		
		hashSet.inserirHashset();
		System.out.println("tempo inserção HashSet: "+ hashSet.getTempoInsercao());
		treeSet.inserirTreeset();
		System.out.println("tempo inserção TreeSet: "+ treeSet.getTempoInsercao()+"\n");
		
		hashSet.getHashSet();
		System.out.println("tempo obtenção HashSet: "+hashSet.getTempoObtencao());
		treeSet.getTreeSet();
		System.out.println("tempo obtenção TreeSet: "+ treeSet.getTempoObtencao()+"\n");
		
		treeSet.navegarTreeSet();
		System.out.println("tempo navegação TreeSet: "+ treeSet.getTempoNavegacao());
		hashSet.navegarHashSet();
		System.out.println("tempo navegação HashSet: "+hashSet.getTempoNavegacao()+"\n");
		
		treeSet.removerTreeset();
		System.out.println("tempo remoção TreeSet: "+treeSet.getTempoRemocao());
		hashSet.removerHashset();
		System.out.println("tempo remoção HashSet: "+ hashSet.getTempoRemocao());
	}
}
