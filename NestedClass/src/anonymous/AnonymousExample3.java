package anonymous;

public class AnonymousExample3 {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method1();
		
		Person ps = new Person() {
			void run() {
				System.out.println("�޸���");
			}
			
			@Override
			void wake() {
				System.out.println("5�ÿ� ���");
				run();
			}
		};
		
		anony.method2(ps);
		
		anony.method2(new Person() {
			int km = 42;
			void run(int km) {
				this.km = km;
				for(int cnt = 0; cnt <= this.km; cnt++) {
					System.out.printf("����(%d/%d)Km�� �޸��� �ֽ��ϴ�.\n", cnt, km);
				}
			}
			
			@Override
			void wake() {
				System.out.println("4�ÿ� ���");
				run(42);
			}
		});
	}
}
