package overriding.basic;

public class Child extends Parent{
	
	/*
	 * �޼��� ������(overriding)
	 * �θ�Ŭ������ ������ �޼��带 �ڽ� Ŭ��������
	 * ��� ���θ� �ٲ㼭 ����ϴ� ��.
	 * 
	 * 1.�������̵��� ��ȯ���� �����ؾ���
	 * 2.�������̵��� �Ű������� �����ؾ��� 
	 */
	
	void method3() {
		System.out.println("�ڽ��� 3�� �޼��� ȣ��!");
	}
	
	void method2() {
		System.out.println("�����ǵ� �ڽ��� 2�� �޼���");
	}
	
}
