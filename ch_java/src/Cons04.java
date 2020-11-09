
class MyDate04 {
	private int year;
	private int month;
	private int day;
/*
MyDate04(){} 매개변수가 없는 디폴드(기본) 생성자를 자바 컴파일러가 묵시적으로
제공한다. 그래서 코드에서 생략해도 된다.	
*/
	void pr() {
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}

public class Cons04 {
	public static void main(String[] args) {
		MyDate04 create1=new MyDate04();
		create1.pr();
	}
}
