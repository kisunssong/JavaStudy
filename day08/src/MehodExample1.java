/*
 * 1. 메서드는 정의(선언)하는 과정과 호출하는 과정이 있습니다.
 * 2. 메서드 선언은 메서드 내부에서는 할 수 없습니다. 반드시 메서드 블록
 * 외부에서만 선언이 가능합니다. 클래스 내부라면 어떤 위치든 선언이 가능합니다.
 * 3. 메서드 내부에서는 다른 메서드의 호출만 가능합니다.
 * 4. 호출하는 과정은 메서드를 사용하는 과정이며 해당 메서드가 필요로 하는
 * 데이터(매개값)를 메서드 내부로 전달하면서 해당 메서드는 매개값을 통해 
 * 처리한 결과값을 호출부로 다시 반환해줍니다.
 */


public class MehodExample1 {
	
	public static int calcSum(int x) {
		
		int sum = 0;
		for (int i=1; i<=x; i++) {
			sum += i;		
	}
	return sum;
}
	public static int calcSum2(int begin, int end) {
		
		int sum = 0;
		for (int i=begin; i<=end; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("1~10까지 누적합: " + calcSum(10));
		System.out.println("1~20까지 누적합: " + calcSum(20));
		
		int result = calcSum(50); //함수의 호출!
		System.out.println(result);
		System.out.println("4~7까지 누적합: " + calcSum2(4, 7));
		}
}
