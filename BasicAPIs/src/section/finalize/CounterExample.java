package section.finalize;

public class CounterExample {

	public static void main(String[] args) {
		Counter counter = null;
		
		for(int cnt = 0; cnt <= 50; cnt++) {
			counter = new Counter(cnt);
			counter = null;
			System.gc();
		}

	}

}
