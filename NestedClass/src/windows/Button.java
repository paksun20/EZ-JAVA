/*
 * [��ø �������̽�]
 * - Ŭ���� �ȿ� �������̽��� ����
 * - Ŭ������ ���ӵ� �������̽��� ����
 */
package windows;

public class Button {
	OnClickListener listener;
	
	Button() {
		System.out.println("Button Class: Constructor...");
	}
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	
	void touch() {
		if(this.listener != null) {
			this.listener.onClick();
		}
	}
	
	interface OnClickListener {
		void onClick(); 
	}
}
