/*
 * [�ν��Ͻ� ��� Ŭ���� ����]
 * - �ܺ� Ŭ������ ��ü�� �����ؾ߸� ���� Ŭ������ ��� �� �� �ִ�. 
 * - ���� Ŭ������ ���� �ʵ�� �޼ҵ带 ���� �� �� ����. 
 */
package instancememberclass;

public class A {
    A() {
         System.out.println("AŬ����(�ܺ�) ����");	
    }     
    
    class B {
    	B() {
            System.out.println("BŬ����(����) ����");	
       } 
   void methodB() {
	   System.out.println("BŬ����(����) methodB");
      }
   }
}
