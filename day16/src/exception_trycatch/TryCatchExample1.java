package exception_trycatch;

public class TryCatchExample1 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		System.out.println(i * j);
		try {
			System.out.println(i / j);
			System.out.println("예외 발생시 이 텍스트는 출력되지 않음.");
		}catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}		
		System.out.println(i + j);
		System.out.println(i - j);
	}
}
