/*
 * [Ŭ������ ��� ���]
 * - ���ٽĿ��� this�� ���������� �����Ǵ� �͸� ��ü�� ������ �ƴ϶�
 *   ���ٽ��� ������ ��ü�� �����̴�.
 * - �ǰ�: �ܺ� Ŭ������ ����� �ʵ�� ������ �ʵ带 ���ٽĿ��� �������� �ʴ� ���� ����.
 */
package section04;

public class UsingThis {
	public int outterField = 10;
	
	void add(int a) {
		this.outterField += a;
		System.out.printf("UsingThis.add(%d), outterField(%d)\n", a, this.outterField);
	}
	
	class Inner {
		int innerField = 20;
		
		void method() {
			MyFunctionalInterface func = () -> {
				int outterField = 99;
				int innerField = 77;
				System.out.println("outterField:" + outterField); // ���ٽĿ� ����� �ʵ带 ����
				System.out.println("outterField: UsingThis.this.outterField=" + 
						UsingThis.this.outterField);  // UsingThis.outterField�� ����
				
				// ���ٽĿ� ����� �ʵ带 �������� ���Ѵ�. (������� ���� ������ �ν�)
				// System.out.println("outterField: this.outterField=" + this.outterField); 

				System.out.println("innerField:" + innerField); // ���ٽĿ� ����� �ʵ带 ����
				System.out.println("innderField: this.innerField=" + this.innerField); // Inner.innerField ����
			};
			
			func.method();
		}
	}
}
