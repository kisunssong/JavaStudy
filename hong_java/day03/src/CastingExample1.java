
public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 작은 데이터타입의 데이터를 큰 데이터타입으로
		 * 변환할 때는 자바 가상머신(JVM)이 데이터타입을
		 * 자동으로 올려서 변환해줍니다.(Promotion/Upcasting)
		 */
		byte b = 10;
		int i = b; // byte -> int 자동 형 변환
		
		char c = '가';
		int j = c; //char -> int 자동 형 변환
		System.out.println("가의 유니코드: " + j);
		
		int k = 500;
		double d = k; //int -> double 자동 형 변환
		System.out.println(d);
		
	

	}

}
