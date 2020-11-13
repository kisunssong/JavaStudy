abstract class Father08 {
	void f08() {
		System.out.println("추상클래스에는 일반 메서드도 올수 있다");
	}
	//선언시 abstract와. {} 블록을 안쓴다. ;마감
	abstract void f09();
	
}
class Child08 extends Father08 {
	//추상클래스 상속시 무조건 오버라이딩해야한다.
	void f09() {
		System.out.println("추상메서드 오버라이딩");
	}
}

public class WeekEx08 {
	public static void main(String[] args) {
		Father08 f; //추상클래스로 참조변수 선언가능
		f = new Child08();
		f.f08(); //Father08 의 본인 일반메서드
		f.f09(); //Father08 로 부터 받은 오버라이딩메서드
		
		Child08 c = (Child08)f; //다운캐스팅 가능
		c.f08(); //상속받은거 호출
		c.f09();
	}
}
