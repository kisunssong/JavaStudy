class A {
	public void methodA(B b) {
		b.methodB();
	}
}
class B {
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class Inter08 {
	public static void main(String[] args) {
//����) AŬ���� ��ü a�� �����ϰ� �� ��ü ������ methodA()�� ȣ���ؼ�
// ��°������ "methodB()"�� ����������.
		A a  = new A();
		a.methodA(new B());
	}
}
