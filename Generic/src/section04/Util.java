/*
 * ���ʸ� �޼ҵ�(Generic Method)
 * - �޼ҵ忡 ���������� ���ʸ��� ���� �� ��
 * - public <T, R> R method(T t) {}
 */
package section04;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static <T> void printUtil(T t) {
		System.out.println("Util:" + t);
	}
	
	public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	/*
	 * ����� Ÿ�Ժ��� �޼ҵ带 ������(�����Ϸ�)���� �����.
	 */
	/*
	public static void printUtil(String t) {
		System.out.println("Util:" + t);
	}

	
	public static void printUtil(Integer t) {
		System.out.println("Util:" + t);
	}

	public static void printUtil(Float t) {
		System.out.println("Util:" + t);
	}

	public static void printUtil(Character t) {
		System.out.println("Util:" + t);
	}
	*/
}
