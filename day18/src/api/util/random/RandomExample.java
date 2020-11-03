package api.util.random;

import java.util.Random;

public class RandomExample {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		// 0.0이상 1.0미만의 실수 난수를 리턴.
		double d = r.nextDouble();
		System.out.println("실수 랜덤값: " + d);
		
		// 논리 랜덤값을 리턴하는 nextBoolean()
		boolean b = r.nextBoolean();
		System.out.println("논리 랜덤값: " + b);
		
		// 정수 랜덤값을 리턴하는 nextInt()
		// 정수 int가 저장할 수 있는 모든 범위에서 난수를 발생.
		int i = r.nextInt();
		System.out.println("정수 랜덤값: " + i);
		
		// 정수 0이상 10미만의 난수를 발생.
		i = r.nextInt(10);
		System.out.println("0이상 10미만 랜덤값: " + i);
		
		i = r.nextInt(10) + 1;
		System.out.println("1이상 10미만 랜덤값: " + i);
		
				
		
	}

}
