package inherit.phone;

public class Phone {
	
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");	
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void ring() {
		System.out.println("벨이 울립니다.");
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
