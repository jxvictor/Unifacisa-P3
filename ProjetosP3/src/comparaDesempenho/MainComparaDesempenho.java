package comparaDesempenho;

public class MainComparaDesempenho {

	public static void main(String[] args) {
		VerificaDesempenhoHashSet hashSet = new VerificaDesempenhoHashSet();
		VerificaDesempenhoTreeSet treeSet = new VerificaDesempenhoTreeSet();
		
		hashSet.inserirHashset();
		System.out.println("tempo inser��o HashSet: "+ hashSet.getTempoInsercao());
		treeSet.inserirTreeset();
		System.out.println("tempo inser��o TreeSet: "+ treeSet.getTempoInsercao()+"\n");
		
		hashSet.getHashSet();
		System.out.println("tempo obten��o HashSet: "+hashSet.getTempoObtencao());
		treeSet.getTreeSet();
		System.out.println("tempo obten��o TreeSet: "+ treeSet.getTempoObtencao()+"\n");
		
		treeSet.navegarTreeSet();
		System.out.println("tempo navega��o TreeSet: "+ treeSet.getTempoNavegacao());
		hashSet.navegarHashSet();
		System.out.println("tempo navega��o HashSet: "+hashSet.getTempoNavegacao()+"\n");
		
		treeSet.removerTreeset();
		System.out.println("tempo remo��o TreeSet: "+treeSet.getTempoRemocao());
		hashSet.removerHashset();
		System.out.println("tempo remo��o HashSet: "+ hashSet.getTempoRemocao());
	}
}
