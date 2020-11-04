package day04;

public class Hong_Test {
	
	public static void main(String[] args) {
		
		//-4 ~ 5 까지의 정수 난수값을 발생.
		// Math.random: 0.0 - 1.0 까지 난수구함
		// 기본 타입은: double
		// ()먼저계산하고 *곱하기 10, int정수로 햇으니 0 - 9출력, 5 - 하면됨
		int r = 5 - (int)(Math.random()*10);
		System.out.println("랜덤값: " + r);
		
		// ()먼저 계산, r랜덤숫자 <= 0, ? r(true) : -r(false)일때 abs에 대입
		int abs = (r >= 0) ? r : -r;
		System.out.println( r + "의 절대값을: " + abs);
	}

}
