package static_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c1 = new Count();
		
		c1.a++;
		c1.b++;
		
		System.out.println("일반 멤버변수 a: " + c1.a);
		System.out.println("일반 멤버변수 b: " + c1.b);
		
		Count c2 = new Count();
		
		c2.a++;
		c2.b++;
		System.out.println("일반 멤버변수 a: " + c2.a);
		System.out.println("일반 멤버변수 b: " + c2.b);
		
		/*
		 * static멤버는 객체와 무관하기 때문에 클래스 이름만으로
		 * 참조하여 사용합니다.
		 * static이 붙은 변수는 그냥 하나로 사용해서 누적된다라고 생각하면됨
		 * static 객체 접근 아님.  개별 접근 임
		 */
		Count.b++;
		Count.b++;
		System.out.println(c1.b);
		System.out.println(c2.b);
		System.out.println(Count.b);
	}

}
