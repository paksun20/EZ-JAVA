package staticmemberclass;

public class A {
	static class C {
		static String staticfieldC = "staticfieldC";
		C(){
		 System.out.println("C(��������) Ŭ����");
	    }
		
		void methodC() {
			System.out.println("C(����) methodC");
		}
		
		static void staticmethodC() {
			System.out.println("C(����) staticfieldC");			
		}
    }

}