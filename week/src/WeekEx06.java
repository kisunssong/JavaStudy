class Father06 {
	void f06() {
		System.out.println("조상클래스 메서드 f06()");
	}
}
class Son01 extends Father06 {
	void s01() {
		System.out.println("첫번째 자손클래스 s01");
	}
}
class Son02 extends Father06 {
	void s02() {
		System.out.println("두번째 자손클래스 s02");
	}
}
public class WeekEx06 {
	public static void main(String[] args) {
		
		print(new Son01());
		print(new Son02());
		
		Father06 f = new Son01();
// f가 Son02타입으로 다운캐스팅 형변환을 허용하냐? 허용되면 참.
// instanceof를 형변환 유무 판단 연산자 키워드
// Son01 > Son02로 형변환 되냐는 뜻과 같다..Son01과 Son02는 아무 관계가없다!!
		if(f instanceof Son02) {
			Son02 s02 = (Son02)f;
		}else {
			System.out.println("불가능");
		}
	}
	
	static void print(Father06 f) {
		//Son01,Son02 이 Father06으로 형변환 가능한지..(상속이되어있을때 사용)
		if(f instanceof Father06) {
			System.out.println(f+"는 된다");
		}else {
			System.out.println(f+"는 안된다");
		}
	}
}
