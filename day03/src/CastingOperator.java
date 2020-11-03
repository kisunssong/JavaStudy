
public class CastingOperator {
	
	public static void main(String[] args) {
		
		char c = 'B';
		int i = 2;
		
//		char cc = (c + i); //c(char유니코드)를 byte가 큰쪽 int로 변경됨
		//그러면 int('B') + int(2) 가 되고, 이거를 char 넣을려니 안되는거다.  
		char cc = (char)(c + i); // 'B'(66) + 2 는 68 = D(유니코드char)
		int ii = c + i; // 'B'(66) + 2 는 68 = 68(정수int)
		System.out.println(cc);
		System.out.println(ii);
		
		int j = 10;
		double d = j / 4;
		System.out.println(d);
		//답은2.5다 하지만 출력값은 2.0 이다
		//10 나누기 4 = 2.5.!! int정수는 소수쩜을 지워버림.
		//2를 double로 넣어버리니... 2.0 이 되는거다.
		
//		double d = (double)j / 4;
//		double d = (double) (j / 4); !!!!!! 답은2.0 ()안에 수를 먼저 연산함!!
		//위와같은 방법이 정확한 표현이다.
		//다른 타입 연산할땐 항상!!!!!! 큰쪽 타입을 따라간다. 
		// 10.0 나누기 4.0(큰타입따라가게됨) = 2.5 가 된다!!
		//****** byte > short(char) > int > long > float > double
		
		byte b1 = 100;
		byte b2 = 10;
//		byte b3 = b1 + b2; 
		//byte,char,short 은 말했다듯이 기본 정수 int이다.
		//int를  byte로 넣으려니 안되는거다.!!
		int b3 = b1 + b2; // 애초에 int로 바꿔야한다.
//		byte b3 = (byte)(b1 + b2); //이것은 되긴하나 위험하다, 오버플로우 방지
		System.out.println(b3);
		
		
	}

}
