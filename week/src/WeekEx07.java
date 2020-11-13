class Father07 {
	void f07() {
		System.out.println("조상클래스 메서드 f07()");
	}
}
class Child07 extends Father07 {
	void f07() {
		System.out.println("오버라이딩 자식 메서드 f07()");
	}
}

public class WeekEx07 {
	public static void main(String[] args) {
		Father07 f = new Father07();
		f.f07();
		
		Father07 f2 = new Child07();
		//업캐스팅 후엔 본인의 메서드는 호출불가!
		//단 오버라이딩을 했다면 불러올수잇다!
		f2.f07();
	}
}
