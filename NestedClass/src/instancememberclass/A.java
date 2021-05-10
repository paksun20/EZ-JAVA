/*
 * [인스턴스 멤버 클래스 예제]
 * - 외부 클래스의 객체를 생성해야만 내부 클래스를 사용 할 수 있다. 
 * - 내부 클래스는 정적 필드와 메소드를 정의 할 수 없다. 
 */
package instancememberclass;

public class A {
    A() {
         System.out.println("A클래스(외부) 생성");	
    }     
    
    class B {
    	B() {
            System.out.println("B클래스(내부) 생성");	
       } 
   void methodB() {
	   System.out.println("B클래스(내부) methodB");
      }
   }
}
