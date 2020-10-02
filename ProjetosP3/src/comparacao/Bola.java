package comparacao;

class Bola implements Comparable<Bola>{
	int size;

	public Bola(int s) {
		size = s;
	}
	public String toString() {
		return size + "";
	}

	@Override
	public int compareTo(Bola o) {
	        return size - o.size;
	}
}