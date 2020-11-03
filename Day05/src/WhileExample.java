
public class WhileExample {

	public static void main(String[] args) {
		//while(조건식 { } - 조건식이 true인 경우 계속 실행

		int i = 1; //초기값 1부터 시작
		int sum = 0; //담을 용기
		while(i <= 10) { //i 가 10보다 작거나 같을때까지
			sum += i++; // 기본sum값 0에 sum+i를 더한다. ++문장이 끝난후 i를 1식 더한다			
		}
		System.out.println(sum);
		// test 12345678910 출력
		int j = 1; //초기값 1부터 시작
		while(j <= 10) { //1이 10보다 작거나 같을때까지
			System.out.print(j++); //1부터 10까지 출력 
		}
	}
}




