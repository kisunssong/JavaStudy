package exception.throws_;

public class Account {
	
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withDraw(int money) throws BalancelnsufficientExample {
		
		if (balance < money) {
			throw new BalancelnsufficientExample("�ܰ� �����մϴ�.");
		}		
		balance -= money;
	}	
}
