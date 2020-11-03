package api.lang.wrapper;

import java.util.Arrays;

public class Boxing {
	
	public static void main(String[] args) {
		
		int a = 100;
		double b = 3.51;
		char c = 'H';
		boolean d = false;
		
		//Boxing: 기본타입의 데이터를 객체타입으로 변환.
		Integer val1 = new Integer(a);
		Double val2 = new Double(b);
		Character val3 = new Character(c);
		Boolean val4 = new Boolean(d);
		Byte val5 = new Byte((byte)75);
		String val6 = new String("hello");
				
		//Object는 위에 클래스들의 부모타입이라 Object에 상속가능
		Object[] arr = {val1, val2, val3, val4, val5, val6};
		//Arrays배열의 toString나열해서 출력해라, arr변수를
		System.out.println(Arrays.toString(arr));
		
		//Unboxing: 포장된 데이터를 다시 기본타입으로 변환.
		//포장클래스가 제공하는 기본타입이름+Value()메서드 이용.
		int i = val1.intValue();
		double j = val2.doubleValue();
		char k = val3.charValue();
		boolean x = val4.booleanValue();
		byte y = val5.byteValue();
	}
}
