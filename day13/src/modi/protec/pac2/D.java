package modi.protec.pac2;

import modi.protec.pac1.*;

public class D extends A{
	
	public D() {

//		A a = new A();
//		a.s = "hi";
//		a.method();
		
		/*
		 * pretected �����ڴ� ��Ű���� �ٸ� ���
		 * �� Ŭ���� ���̿� ��Ӱ��谡 �ִٸ�
		 * super�� ���� ������ ����մϴ�.
		 */
		super();
		super.s = "hi";
		super.method();
		
		
	}
	

}
