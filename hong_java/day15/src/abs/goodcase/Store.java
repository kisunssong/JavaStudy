package abs.goodcase;

public class Store extends HeadStore{
	
	public Store() {
		super();
	}
	
	
	// absract 가 있는 메서드는 무조건 오버라이딩해와야 한다.
	public void orderBanana() {
		System.out.println("바나나 쥬스의 가격은 2800원입니다.");
	}
	public void orderMelon() {
		System.out.println("멜론 쥬스의 가격은 4800원입니다.");
	}
	public void orderApple() {
		System.out.println("사과 쥬스의 가격은 3000원입니다.");
	}
	public void orderGrape() {
		System.out.println("포도 쥬스의 가격은 3500원입니다.");
	}
	
	public void orderwaterMelon() { // 일반메서드로 오버라이딩 후 변경가능
		System.out.println("수박 쥬스의 가격은 4500원입니다.");
	}
//	public void orderPeach() { // final제한자 로 변경 불가
//		System.out.println("수작 쥬스의 가격은 4500원입니다.");
//	}
	
}
