class Parent04 {
	void p04() {
		System.out.println("���� Ŭ���� �޼��� p04()");
	}
}

class Child04 extends Parent04 {
/*
�޼��� �������̵� �̶�?
1. �������̵��� �ҷ��� ������ ��Ӱ��踦 �� ������ �Ѵ�.
2. �޼��� �������̵��̶� �θ�Ŭ������ �޼����,�Ű����� ����(Ÿ��,����),�޼��� ��ȯŸ��
�޼��� ����ο� ��ġ�� ���� �״�� �ڼ����� ��ӹ��� ���¿��� �ڼտ� �´�{} ���� ��ü��
���� ���� �����ϴ� ���� ���Ѵ�.
*/
	void p04() {
		System.out.println("�������̵� �� �޼���");
	}
	void ch04() {
		System.out.println("�ڼ�Ŭ���� �޼��� ch04()");
	}
}

public class Extend04 {
	public static void main(String[] args) {
		Child04 c = new Child04();
		c.p04(); //�������̵��� �޼���
		c.ch04(); //���� �޼���
		
		Parent04 p = new Parent04();
		p.p04(); //����Ŭ���� �޼���
	}
}
