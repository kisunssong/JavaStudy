package final_.method;

public class Child extends Parent{
	
	public void method1() {}
	public void method2() {}
//	public void method3() {} //�θ�Ŭ�������� method3 �� finaló����.
	
	public Child() {
		method1();
		method2();
		//method3�����(���)�� �����ϰ����ش�. ���������̾ȵ�.
		method3();
	}

}
