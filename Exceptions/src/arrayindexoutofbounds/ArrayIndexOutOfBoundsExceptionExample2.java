package arrayindexoutofbounds;

public class ArrayIndexOutOfBoundsExceptionExample2 {

	public static void main(String[] args) {
		String s1 = "����";
		String s2 = "����";

		if(args.length > 1) {
			s1 = args[0];
			s2 = args[1];
		}
		
		System.out.println("args[0] " + s1);
		System.out.println("args[1] " + s2);
	}

}
