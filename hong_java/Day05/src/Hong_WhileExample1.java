
public class Hong_WhileExample1 {
	public static void main(String[] args) {
		
		int sum = 0; // 담을 변수
		int age = 1; // 증감 변수
		while (age <= 10) { //반복 조건 
		sum += age;
		age++;		 // 증감 식
		}
		System.out.println("1부터 10까지의 누적합 : " + sum);
	}

}