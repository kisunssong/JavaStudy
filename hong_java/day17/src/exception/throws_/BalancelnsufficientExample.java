package exception.throws_;

/*
 * ����� ���� ���� Ŭ������ ������� ExceptionŬ������
 * RuntimeException Ŭ������ ��ӹ޽��ϴ�.
 */


public class BalancelnsufficientExample extends Exception{
	
	/*
	 * �Ϲ������� ����� ���� ����Ŭ������ ���� ���� 
	 * �⺻�����ڿ� ���� ���� �޽����� �Ű������� �޴� �����ڸ�
	 * �����մϴ�.
	 */

	public BalancelnsufficientExample() {}
	
	public BalancelnsufficientExample(String message) {
		super(message);
	}
}
