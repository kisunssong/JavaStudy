package exception.throws_;

public class MainClass {

	public static void main(String[] args) {
		
		Account acc = new Account();
			acc.deposit(10000);
			System.out.printf("�Ա� �� �ܾ�: %d��\n", + acc.getBalance());
		
		try {
			acc.withDraw(17000);
		} catch (BalancelnsufficientExample e) {
			/*
			 * ���� Ŭ������ �����ϴ� getMessage()�޼����
			 * ������ ���� �޽����� StringŸ������ ���� �մϴ�.
			 * �ڹ� ǥ�� API���� �����ϴ� �پ��� ����Ŭ��������
			 * ������ ���� ���� �޽����� �⺻������ ��ü �ȿ�
			 * ����Ǿ� �ֽ��ϴ�.
			 */
			System.out.println(e.getMessage());
		}
		System.out.printf("��� �� �ܾ�: %d��", acc.getBalance());
	}
}
