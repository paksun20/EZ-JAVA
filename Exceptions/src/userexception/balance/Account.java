package userexception.balance;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(this.balance < money) {
			String msg = String.format("�ܰ����:(%d)���� �����մϴ�.", (money-this.balance));
			BalanceInsufficientException exception = new BalanceInsufficientException(this, msg);
			throw exception;
		}
		
		this.balance -= money;
	}

}
