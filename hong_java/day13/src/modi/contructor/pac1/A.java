package modi.contructor.pac1;

public class A {
	
	//��� ���� ����
	A a1 = new A(true); //public ������ ȣ��
	A a2 = new A(3); //p.f ������ ȣ��
	A a3 = new A("hi"); //private ������ ȣ��
	
	//������ ����.
	public A(boolean b) {} //public����
	
	A(int i) {} //package friendly ����
	
	private A(String s) {} //private����
}
