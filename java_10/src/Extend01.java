/*
Ŭ���� ��� ����)
class �ڼ� Ŭ���� extends ����Ŭ����{
}
Ŭ���� ����� ���ϻ�Ӹ� �����ϴ�. �� �ϳ��� �������κ��͸� ��Ӱ����ϴ�.
*/
//�ڹ��� ��� Ŭ������ ������� ����� ���� ������ �ڹ� �ֻ��� ����Ŭ���� object���� ����
//�������� ����� �޴´�.

class Parent01 {
	public void p01() {
		System.out.println("���� Ŭ���� p01()");
	}
}
class Child01 extends Parent01 {	
	public void ch01() {
		System.out.println("�ڼ� Ŭ���� ch01()");
	}
}
	
public class Extend01 {
	public static void main(String[] args) {
		Child01 ch = new Child01();
		ch.p01(); // ��ӹ޾Ƽ� �ش� �޼��� ȣ��
		ch.ch01(); // �ڼ�Ŭ���� �ڽ� �޼��带 ȣ��
		Parent01 p = new Parent01();
		p.p01();
//		p.ch01(); ����Ŭ�������� �ڼ�Ŭ���� �޼��� ȣ�����.
	}
}
