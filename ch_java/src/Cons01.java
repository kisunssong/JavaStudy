class MyDate01 {
	private int year; //년도: 클래스 소속의 속성, 멤저변수 
	private int month; //월: int타입의 멤버변수 초기 기본값으로 0이 저장됨
	private int day; //일
	
	public MyDate01() {
/*
생성자 특징)
1. 생성자는 클래스이름과 같다.
2. 생성자 명 앞에는 자료형이 안들어 간다. 즉 리턴타입을 사용하지 않는다.
*/
		System.out.println("기본 생성자 호출");
	}
	public void print() {
		System.out.println(year+"/"+month+"/"+day);
	}
}

public class Cons01 {
	public static void main(String[] args) {
		new MyDate01();
		System.out.println("===============");
		MyDate01 m=new MyDate01();
		m.print();
		new MyDate01().print();
	}
}
