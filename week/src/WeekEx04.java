class Father04 {
	protected int a;
	protected int b;
	
	Father04 (int a, int b) {
		//super(); Object의 기본생성자를 호출, 암시적있음.
		this.a = a;
		this.b = b;
	}
}
class Child04 extends Father04{
	protected int c;
	
	Child04 () {
		super(100,200); //오버로딩 된 생성자 호출
	}
	Child04 (int a, int b, int c) {
		super(a,b);
		this.c = c;
	}
	void print() {
		System.out.printf("a값:%d b값:%d c값:%d\n",a,b,c);
	}
}
public class WeekEx04 {
	public static void main(String[] args) {
//		기본생성자 호출시 super(100,200)을 부모생성자(a,b)매개변수로 받아 값 입력
		Child04 ch = new Child04();
		ch.print();
		//a값:100 b값:200 c값:0
		
//		인자값생성자 호출시 10,20은 부모생성자(a,b)매개변수로 전달, 30은 자신이 입력
		Child04 ch1 = new Child04(10,20,30);
		ch1.print();
		//a값:10 b값:20 c값:30
	}
}
