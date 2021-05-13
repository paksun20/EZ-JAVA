package exercises.exercise06;

public class Chatting {
	void startChat(String chatId) {
		/*
		 * �͸� ���� ��ü���� ���� ������ ����ϰ� �Ǹ�
		 * �� ������ final Ư���� ���� �ǹǷ� ���� ������ �� ����.
		String nickName = null;
		nickName = chatId;
		*/
		// final Ư���� ���� ��
		// String nickName = chatId;
		final String nickName = chatId;
		
		Chat chat = new Chat() { // �͸� ���� ��ü���� nickName�� ���
			@Override
			public void start() {
				while(true) {
					String inputData = "Hi!";
					String msg = "[" + nickName + "]" + inputData;
					// String msg = "[" + chatId + "]" + inputData;
					send(msg);
				}
			}
		};
		
		chat.start();
	}
	
	public class Chat {
		void start() {}
		void send(String msg) {}
	}
}
