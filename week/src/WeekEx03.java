//부모와 자식이 동일변수가 정의된 경우 super.변수명을 사용
class Father03 {
	int x = 10;
	int y = 20;
	
	public Father03(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Child03 extends Father03 {
	int x = 100;
	int y = 200;
	int z = 30;
	
	public Child03(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	void print() {
		System.out.printf("자식 -> x좌표:%d y좌표:%d z좌표:%d\n",x,y,z);
		System.out.printf("부모 -> x좌표:%d y좌표:%d z좌표:%d",super.x,super.y,z);
	}
}

public class WeekEx03 {
	public static void main(String[] args) {
		Child03 ch = new Child03(10,20,30);
		ch.print();
	
	}
}
