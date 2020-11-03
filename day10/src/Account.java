
public class Account {
	/*
	 * 1. 멤버변수는 예금주이름(name : String),
	 * 비밀번호(password: int), 잔액(balance: int)
	 * 로 선언하세요
	 * 2. 생성자는 3가지 멤버변수를 모두 매개값으로 받아
	 * 초기화하는 생성자를 선언하세요.
	 * 3.메서드는 입금기능 메서드(deposit : void)
	 * 출금기능 메서드(withDraw : void),
	 * 잔액 조회기능 메서드(getBalance: int)
	 * 3가지를 선언하세요.
	 */
	
	String name;
	int password;
	int balance;
		
	void deposit(int n) {		
		balance += n;
	}	
	void withDraw(int n) {
		balance -= n;
	}	
	int getBalance() {
		return balance;
	}

	
	Account() {		
	}	
	Account(String bName, int bPassword, int bBalance) {
		name = bName;
		password = bPassword;
		balance = bBalance;
		
	}
}
