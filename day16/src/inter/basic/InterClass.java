package inter.basic;
/*
 * 1. �������̽��� ����Ϸ��� Ŭ�������� �ش� �������̽��� �����ؾ� �մϴ�.
 * 2. �������̽��� �����ϴ� Ű����� implements�Դϴ�.
 * 3. �������̽��� ��Ӱ� �޸� ���� �������̽����� ���ÿ� ���߱����� �� 
 * �ֽ��ϴ�.
 * 4. �������̽��� ������ �� �������̽� ���ο� ����� �߻�޼������
 * �ݵ�� ���� �������ؾ� �մϴ�.
 */
public class InterClass implements Inter1, Inter2{ // 2������ ������
	
	public void method1() { // �������̽��� �ڵ� abstract�پ ��üȭ�������
		System.out.println("Inter1�� �޼��� ����");
	}
	public void method2() { // �������̽��� �ڵ� abstract�پ ��üȭ�������
		System.out.println("Inter2�� �޼��� ����");
	}
	
	public void method3() { 
		System.out.println("Ŭ������ �޼��� ȣ��");
	}
	
	
}
