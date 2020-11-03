package abs.goodcase;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 *추상 클래스를 스스로 객체를 생성할 수 없습니다.
		 *반드시 상속을 통해 클래스를 구체화시켜야 합니다. 
		 */
		
//		HeadStore h = new HeadStore(); // 객체생성은 안됨.
		HeadStore s = new Store(); // 자식클래스를 통해 객체를 만든다.
		s.orderApple();
		s.orderwaterMelon();
		s.orderPeach();
	}

}
