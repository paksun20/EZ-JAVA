package userexception;

public class UserExceptionExample {
	public static void main(String[] args) {
		try {
			// user(null);
			user("ȫ�浿");
		} 
		catch(UserException e) {
			System.out.println("main:" + e.getMessage());
		}
	}

	static void user(String msg) throws UserException {
		if(msg == null) {
			throw new UserException("������� �̸��� �����ϴ�.");
		}
		
		System.out.println("user: " + msg);
	}
}
