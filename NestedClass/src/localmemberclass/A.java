/*
 * [로컬 멤버 클래스 예제]
 * 인스턴스 메소드 안에 정의된 클래스 
 */
package localmemberclass;

public class A {
    A() {
         System.out.println("A로컬클래스 생성");	
    }     
  
   void methodA() {
	   class D {
		   D() {
			   System.out.println("D로컬클래스");			   
		   }
		   
		   void methodD() {
			   System.out.println("D로컬클래스 methodD");			   
		   }
	   }
	   
	   D d = new D();
	   d.methodD();
   }
}
