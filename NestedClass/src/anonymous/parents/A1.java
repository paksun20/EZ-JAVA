/*
 * �͸�ü
 */
package anonymous.parents;

public class A1 {
	Parent field = new Parent() {
		int childField = 99;
		
		/*
		 * �͸�ü�� �����ڸ� ������ �� ����.
		Child() {}
		Parent() {}
		*/
		
		@Override
		void parentMethod(String loc) {
			System.out.println("A1.parentMethod() ->" + loc);
			fieldMethod();
		}
		
		void fieldMethod() {
			System.out.println("A1.fieldMethod() ->" + childField);
		}
	};
	
	void accessField() {
		field.parentMethod("accessField");
		field.parentMethodX("accessField");
		
		// �θ� Ŭ������ �������̽��� ����� �ʵ�� �޼ҵ� �̿ܿ� �ٸ� �ʵ�� �޼ҵ带 ������ �� ������,
		// �͸� ��ü ���ο����� ����� �����ϴ�.
		// field.fieldMethod();
		// field.childField;
	}
	
	void method() {
		Parent localVar = new Parent() {
			@Override
			void parentMethod(String loc) {
				System.out.println("A1.parentMethod() ->" + loc);
			}		
		};
		
		localVar.parentMethod("A1.method");
	}

	public static void main(String[] args) {
		A1 a = new A1();
		a.field.parentMethod("A1.main");
		a.method();
		a.accessField();
	}
}
