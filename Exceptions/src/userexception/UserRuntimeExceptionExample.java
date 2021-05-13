package userexception;

public class UserRuntimeExceptionExample {
	public static void main(String[] args) {
		try {
			runtime(null);
			// runtime("�ý�������");
		} 
		catch(UserRuntimeException e) {
			System.out.println("main:" + e.getMessage());
		}
	}

	static void runtime(String msg) throws UserRuntimeException {
		if(msg == null) {
			throw new UserRuntimeException("�ý��� ������ �����ϴ�.");
		}
		
		System.out.println("runtime: " + msg);
	}
}
