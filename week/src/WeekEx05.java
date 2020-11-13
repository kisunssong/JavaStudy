class Father05 {
	void fa05() {
		System.out.println("부모클래스 메서드 f05()");
	}
}
class Child05 extends Father05 {
	void ch05() {
		System.out.println("자식클래스 메서드 f05()");
	}
}

public class WeekEx05 {
	public static void main(String[] args) {
		
		Father05 fa = new Child05(); //업캐스팅, 상속관계에서 자손->조상타입 변환
		fa.fa05();
//		fa.ch05(); // 업캐스팅이후, 본인 메서드 사용못함
		
		System.out.println("=================");
		Child05 ch = (Child05)fa; // fa만 다운캐스팅가능
		//상속관계에서 부모타입을 자손타입으로 변경하는 것
		//반드시 사전에 업캐스팅을 한것에 한해서만 다운캐스팅 가능!
		//(자손타입) 형변환(캐스팅) 연산자를 명시적으로 사용해서 다운캐스팅해야함
	}
}
