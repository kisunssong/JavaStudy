/*
 * 매개 변수(parameter)
 * 
 * 1. 매개 변수는 메서드를 호출할 때 실행에 필요한 값들을 메서드 내부로
 * 전달하기 위한 매개체입니다.
 * 2. 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라 메서드의 실행
 * 결과가 달라집니다.
 * 3. 매개변수를 몇 개 전달받을 지는 메서드를 선언할 때 선언부에서 결정해야
 * 합니다.
 * 4. 매개변수를 하나도 선언하지 않을 수 있으며 이 때는 메서드 선언부의
 * ()를 비워둡니다. 그리고 호출시에도 ()를 비워서 호출합니다.
 */


public class MehodExample2 {
	
	public static void main(String[] args) {
		
		System.out.println(calcSum());
		System.out.println("이번에 획득한 무기: " + randomWeapon());
		
	}
	
	public static int calcSum() {
		
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static String randomWeapon() {
		double d = Math.random();
		
		if(d > 0.66)
			return "단검";
		else if (d > 0.33)
			return "장궁";
		else
			return "지팡이";
	}

}
