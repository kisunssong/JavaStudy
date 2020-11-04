package exception.throws_;

public class ThrowExample {
	
	public static int calcSum(int n) throws Exception{
		
		/*
		 * 프로그램이 throw구문을 만나는 순간 즉시 예외를 강제로
		 * 발생시키게 되며 해당 예외를 처리해줄 catch블록을 검색합니다.
		 */
		
		if (n <= 0) {
			throw new Exception();
		}
				
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		try {
		int result1 = calcSum(50);
		System.out.println("1~100까지의 누적합: " + result1);
		
		int result2 = calcSum(-100);
		System.out.println("1~100까지의 누적합: " + result2);
		}catch(Exception e) {
			System.out.println("매가값을 양수로 전해주세요");
		}		
	}
}
