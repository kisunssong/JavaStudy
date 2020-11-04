package api.lang.wrapper;

import java.util.Arrays;

public class Boxing {
	
	public static void main(String[] args) {
		
		int a = 100;
		double b = 3.51;
		char c = 'H';
		boolean d = false;
		
		//Boxing: �⺻Ÿ���� �����͸� ��üŸ������ ��ȯ.
		Integer val1 = new Integer(a);
		Double val2 = new Double(b);
		Character val3 = new Character(c);
		Boolean val4 = new Boolean(d);
		Byte val5 = new Byte((byte)75);
		String val6 = new String("hello");
				
		//Object�� ���� Ŭ�������� �θ�Ÿ���̶� Object�� ��Ӱ���
		Object[] arr = {val1, val2, val3, val4, val5, val6};
		//Arrays�迭�� toString�����ؼ� ����ض�, arr������
		System.out.println(Arrays.toString(arr));
		
		//Unboxing: ����� �����͸� �ٽ� �⺻Ÿ������ ��ȯ.
		//����Ŭ������ �����ϴ� �⺻Ÿ���̸�+Value()�޼��� �̿�.
		int i = val1.intValue();
		double j = val2.doubleValue();
		char k = val3.charValue();
		boolean x = val4.booleanValue();
		byte y = val5.byteValue();
	}
}
