
public class IntegerExample {

	public static void main(String[] args) {
		
		byte a =127;
		short b = 32767;
		int c = 2147483647;
		long d = 2147483648L;
//변수는 변하는 데이터
//정수는 일반 숫자 int라고도 하며 위의 변수a,b,c는 int라고도 한다.
//long 뒤에 L이 붙은 의미는 int의 기본저장수치가 넘어섯기때문에, long로 변화 하려면 뒤에 L을 표기
		
		System.out.println(d);
		
		int bin = 0b1010;
		System.out.println("2진수 1010:" + bin);
		//8진수 저장시에 정수 앞에 접두어로 0을 붙임
		
		int octa = 064;
		System.out.println("8진수 64:" + octa);
		//8진수 저장시에 정수 앞에 접두어로 0을 붙임
		
		int hexa = 0x3a4c;
		System.out.println("16진수 3a4c:" + hexa);
		//16진수 저장시에 정수 앞에 접두어로 0x를 붙임
				

	}

}
