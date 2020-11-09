class Computer {
/*
문제) 자바 5버전에서 추가된 가변인자 문법을 사용하여 매개변수 개수, 인자값 개수가
다른 메서드가 오버로딩 된 경우 한개의 메서드로 가변인자로 받아 배열로 처리해서 일반
for 반복문으로 각각의 배열원소 누적합을 구해서 리턴한다.
*/
	
//	public int sum(int[] arr) {
//		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		return sum;
//	}
	
	int sum(int... arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}

public class Week18 {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		int[] values = {1,2,3};
		int result = com.sum(values);
		System.out.println("누적합: "+result);
		
		result = com.sum(new int[] {1,2,3,4,5});
		System.out.println("누적합: "+result);
		
		result = com.sum(10,20,30);
		System.out.println("정수: "+result);
	}
}
