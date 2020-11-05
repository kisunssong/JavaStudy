class MyDate03 {
	private int year;
	private int month;
	private int day;

/*
1. 생성자 또는 메서드()내에 선언된 변수를 매개변수 또는 전달인자라고 한다.
2. 이 매개변수에 저장되는 값을 인자값 즉 parameter value이다.
*/
	MyDate03() {
		year=2019; month=11; day=2;
	}
	
/*
1.생성자 오버로딩이란 같은 이름의 생성자명을 여러번 중복해서 정의하는 것을 말함.
2. 생성자도 메서드의 일종이기 떄문에 생성자 오버로딩 문법이 적용된다.
3. 전달인자 즉 매개변수가 없는 생성자를 기본생성자라고 한다. 기본생성자는
자바 컴파일러(javac)에 의해서 기본으로 제공한다. (코드상 생략가능하다)	
*/
	MyDate03(int new_year, int new_month, int new_day) {
		year=new_year; month=new_month; day=new_day;		
	}
	
	public void info() {
		System.out.println(year+"년"+month+"월"+day+"일");
	}
}

public class Cons03 {
	public static void main(String[] args) {
		
		MyDate03 n1=new MyDate03();
		n1.info();
		MyDate03 n2=new MyDate03(2022,12,25);
		n2.info();
	}
}
