package static_.method;

public class Count {
	
	public int a;
	public static int b;
	
	//�Ϲ� �޼��� ����.
	//�Ϲ� �޼��� �ȿ����� �Ϲݸ�������� ������������� ��� ������ �� ����.
	public int method1() {
		a = 10;
		return a + b;
	}
	
	//���� �޼��� ����.
	public static int method2() {
		/*
		 * static �޼��� ���ο����� static�� ���� ������ �޼��常
		 * ������ �� �ֽ��ϴ�.
		 * static��� ���ο��� non-static����� �����Ϸ���
		 * ��ü ������ ���� �����ؾ� �մϴ�.
		 */
		
//		a = 10; // static�Ⱥ��� �������
		Count c = new Count();
		c.a = 10;
		return c.a + b;
	}
}
