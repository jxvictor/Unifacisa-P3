package comparacao;


import java.util.HashSet;
import java.util.Iterator;


	public class HashSetTeste {
		public static void main(String[] args) {
			//
			HashSet<Bola> aset = new HashSet<Bola>();
			aset.add(new Bola(2));
			aset.add(new Bola(1));
			aset.add(new Bola(3));
			aset.add(new Bola(5));
			aset.add(new Bola(4));
			aset.remove(new Bola(3));
			aset.remove(new Bola(1));
			//
			Iterator<Bola> iterator = aset.iterator();

			while (iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
		}
	}
