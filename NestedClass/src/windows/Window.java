package windows;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	Button button3 = new Button();
	
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	Window() {
		button3.setOnClickListener(listener);
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}
			
}
