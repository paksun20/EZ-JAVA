/*
 * [��ø Ŭ�������� �ʵ�� �޼ҵ��� ���� ����]
 */
package accessfieldmethod;

public class A {
	// B fieldB = new B();
	// C fieldC = new C();
	B fieldB = null;
	C fieldC = null;
	B filedX = this.new B("B filedX");
	B filedY = null;
	
	// ���� �ʵ�� this(��ü���۷���)�� ������ ���� ����
	// static B staticFieldB = new B();
	// static B staticFieldB = this.new B();
	
	// Ŭ���� C�� ���� ��� Ŭ�����̹Ƿ� ���� �ʵ� ������ �� �� �ִ�.
	static C staticFieldC = new C("staticFieldC");
	
	A() {
		System.out.println("A class");
		this.fieldB = new B();
		this.fieldC = new C();
		this.filedY = this.new B("B fieldY");
	}
	
	class B {
		String name;
		B() {
			System.out.println("B class");
		}
		
		B(String name) {
			this.name = name;
			System.out.println(name);
		}
	}
	
	static class C {
		String name;
		C() {
			System.out.println("C class");
		}
		
		C(String name) {
			this.name = name;
			System.out.println(name);
		}
		
		void methodC() {
			System.out.println(name + ":" + "methodC()");
		}
	}
	
	
	// �ٸ� ��Ű���� Ŭ���� �̸��� �浹�� �� ���
	// A.B fieldB = new A.B();
	// A.C fieldC = new A.C();
	
	void instanceMethod() {
		B localB = new B("localB");
		C localC = new C("localC");
	}
	
	// ���� ��� �޼ҵ�
	// ���� �޹� �޼ҵ�� ��ü�� this�� ������ ���� �ʴ�.
	// �ν��Ͻ� ��� Ŭ������ ������ �� ����.
	static void staticMethod() {
		// B staticLocalB = new B("staticLocalB");
		// B staticLocalB = this.new B("staticLocalB");
		C staticLocalC = new C("staticLocalC");
	}
}
