
public class Hong_ForExample1 {
	
	public static void main(String[] args) {
		
		int sum = 0;
			//제어변수 ; 조건표현       ; step증감식
            //1번시작  ; 2번시작 6번 ; 4번시작 5번
		for (int n=1; n <= 10; n++) {
			sum += n; // 3번시작 7번 총값
			
		}
		System.out.println("누적합: " + sum);
	}

}
