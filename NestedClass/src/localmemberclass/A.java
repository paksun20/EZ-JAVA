/*
 * [���� ��� Ŭ���� ����]
 * �ν��Ͻ� �޼ҵ� �ȿ� ���ǵ� Ŭ���� 
 */
package localmemberclass;

public class A {
    A() {
         System.out.println("A����Ŭ���� ����");	
    }     
  
   void methodA() {
	   class D {
		   D() {
			   System.out.println("D����Ŭ����");			   
		   }
		   
		   void methodD() {
			   System.out.println("D����Ŭ���� methodD");			   
		   }
	   }
	   
	   D d = new D();
	   d.methodD();
   }
}
