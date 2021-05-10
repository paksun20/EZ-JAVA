package staticmemberclass;

public class AExample {

	public static void main(String[] args) {
		A.C c = new A.C();
		c.methodC();
		A.C.staticmethodC();
		
		System.out.println("A.C.staticfieldC : " + A.C.staticfieldC);
    }
		
}
