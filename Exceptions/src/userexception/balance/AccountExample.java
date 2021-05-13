package userexception.balance;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		balanceAccount("�����ܰ�", account);
		
		try {
			account.withdraw(500000);
		}
		catch(BalanceInsufficientException e) {
			System.out.println("����:" + e.getMessage());
			balanceAccount("�����ܰ�", account);
			
			System.out.println("---------------------------------");
			e.printStackTrace();
			System.out.println("---------------------------------");
		}
		
		System.out.println("ó�� �Ϸ�");
	}
	
	static void balanceAccount(String title, Account account) {
		System.out.println(title + ": " + account.getBalance());
	}

}
