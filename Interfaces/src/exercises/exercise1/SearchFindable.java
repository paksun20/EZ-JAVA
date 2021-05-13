package exercises.exercise1;

public interface SearchFindable {
	// public static final String hello = new String("Hello");
	String hello = new String("Hello"); // static final
	
	void find(String text);
	void search(String url);
	void lookup(String topic);
	
	public static void info(SearchFindable sf) {
		sf.search("Ž��");
		sf.find("ã��");
		sf.lookup("�˻�");
		System.out.println(SearchFindable.hello);
	}
}
