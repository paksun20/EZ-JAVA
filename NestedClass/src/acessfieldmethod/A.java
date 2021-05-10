/*
 * [중첩 클래스에서 필드와 메소드의 접근 제한]
 */
package acessfieldmethod;

public class A {
//  정적필드 는 this(객체레퍼런스)를 가지고 있지 않으므로 사용할 수 없다. 	
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
