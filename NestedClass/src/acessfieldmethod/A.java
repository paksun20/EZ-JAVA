/*
 * [��ø Ŭ�������� �ʵ�� �޼ҵ��� ���� ����]
 */
package acessfieldmethod;

public class A {
//  �����ʵ� �� this(��ü���۷���)�� ������ ���� �����Ƿ� ����� �� ����. 	
//	static B staticfieldB = new B();
//	static B staticfieldB = this.new B();
	static C staticfieldC = new C("staticfieldC");
	
	class B {
		B(){
			System.out.println("B class");
		}
	}
	static class C {
		String name;
		
		C(){
			System.out.println("c class");
		}
		C(String name){
			this.name = name;
			System.out.println(name);
		}
		
		
	}
	
    B fileldB = new B();
	C fileldC = new C();
	
	void instanceMethod() {
		B localB = new B();
		C localC = new C("localC");
	}
	
	static void staticMethod2() {
//		B localB1 = new B();
		C localC1 = new C("localC");
	}
	
}
