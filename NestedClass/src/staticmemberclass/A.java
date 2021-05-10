package staticmemberclass;

public class A {
	static class C {
		static String staticfieldC = "staticfieldC";
		C(){
		 System.out.println("C(정적내부) 클래스");
	    }
		
		void methodC() {
			System.out.println("C(정적) methodC");
		}
		
		static void staticmethodC() {
			System.out.println("C(정적) staticfieldC");			
		}
    }

}