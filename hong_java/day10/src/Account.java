
public class Account {
	/*
	 * 1. ��������� �������̸�(name : String),
	 * ��й�ȣ(password: int), �ܾ�(balance: int)
	 * �� �����ϼ���
	 * 2. �����ڴ� 3���� ��������� ��� �Ű������� �޾�
	 * �ʱ�ȭ�ϴ� �����ڸ� �����ϼ���.
	 * 3.�޼���� �Աݱ�� �޼���(deposit : void)
	 * ��ݱ�� �޼���(withDraw : void),
	 * �ܾ� ��ȸ��� �޼���(getBalance: int)
	 * 3������ �����ϼ���.
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
