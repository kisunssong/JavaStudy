abstract class Abstract11 {
	abstract void m01();
	
	void m02() {
		System.out.println("�Ϲ� �޼��� m02()");
	}
}
abstract class MiddleClass extends Abstract11 {
	//�߻�Ŭ������ ��ӹ��� �ڼ��� ������ �߻�޼��带 �������̵��� ���������� �ڼյ�
	//�߻�Ŭ�����̾�� �Ѵ�
	
	void m03() {
		System.out.println("�Ϲݸ޼��� m03()");
	}
}
abstract class SubClass11 extends MiddleClass{
	void m01() {
		System.out.println("�Ϲ� �޼��� �������̵�");
	}
}

public class Abs11 {
	public static void main(String[] args) {
		SubClass11 sub = new SubClass11();
		sub.m01();
		sub.m02();
		
	}
}
