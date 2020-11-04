
public class ForExample {
	public static void main(String[] args) {
		
		int sum = 0; //담을 용기 0
		//초기값: 1, 조건값: 10보다같거나 작을때, 증감표현: 문장이 끝난후 1식 더함 
		for (int i=0; i<=10; i++) { 
			sum += i;
		}
		System.out.println(sum);
		
		//test 246810 만들기
		for (int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i);
			}
		}		
	}
		
}
