package api.lang.wrapper;

import java.util.Arrays;

public class AutoBoxing {
	
	public static void main(String[] args) {
		
		//AutoBoxing: �⺻Ÿ�� �����͸� �ڵ����� ��ü�� ��ȯ.
		//�ڹ�10�������ʹ� ����ڽ� ��ɸ��� ����ϵ��� �ǰ��ϰ� �ֽ��ϴ�.
		
		int a = 100;
		
		Integer val1 = a;
		Double val2 = 3.1415;
		
		Object[] arr = {56, 3.154, "�ȳ�", 99, 200.12};
		System.out.println(Arrays.toString(arr));
		
		//AutoUnboxing
		int x = val1;
		double y = val2 + 5.3; //Double(Unboxing��) + double
		
		//Parsing: ���ڿ������͸� �⺻Ÿ������ ��ȯ
		String s1 = "10";
		String s2 = "5.43";
		
		//intŸ�� i�� ���ڿ�s1������ (Integer.parseInt)������ ��ȯ�ض� 
		int i = Integer.parseInt(s1);
		double j = Double.parseDouble(s2);
		boolean k = Boolean.parseBoolean("true");
	}
}
