package userexception.balance;

public class AccountExample2 {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		balanceAccount("�����ܰ�", account);
		
		try {
			account.withdraw(500000);
		}
		catch(BalanceInsufficientException e) {
			e.balanceAccount("�ܰ����");
		}
		
		System.out.println("ó�� �Ϸ�");
	}
	
	static void balanceAccount(String title, Account account) {
		System.out.println(title + ": " + account.getBalance());
	}

}
