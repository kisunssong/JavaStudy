class MyDate02 {
	private int year;
	private int month;
	private int day;
	
	MyDate02() {
		year=2020; month=11; day=5;
/*
생성자의 주된기능)
1. 클래스 소속의 멤버변수 종류중 객체를 생성해서 접근할 수 있는 변수를 
인스턴스 변수라고한다. 바로 이 인스턴스 변수 명시적인 초기화 기능을 생성자가가짐.
*/
	}
	
	void p() {
		System.out.println(year+"년"+month+"월"+day+"일");
	}
}

public class Cons02 {
	public static void main(String[] args) {
		
		MyDate02 d=new MyDate02();
		d.p();
	}
}
