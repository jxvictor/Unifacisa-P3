package comparacao;


import java.util.Iterator;
import java.util.TreeSet;

	public class TreeSetTeste {
		public static void main(String[] args) {
			TreeSet<Bola> dset = new TreeSet<Bola>();
			dset.add(new Bola(2));
			dset.add(new Bola(1));
			dset.add(new Bola(3));
			dset.remove(new Bola(3));
			dset.remove(new Bola(1));
			//

			Iterator<Bola> iterator = dset.iterator();

			while (iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
		}
	}
