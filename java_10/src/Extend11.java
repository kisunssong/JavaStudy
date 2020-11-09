class Point14 {
	int x = 10;
	int y = 20;
	
	Point14(int x, int y) {
		this.x=x; this.y=y;
	}
}
class Point15 extends Point14 {
	int z = 30;
	Point15() {
		this(100,200,300);
	}
	Point15(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	void pr() {
		System.out.printf("x:%d y:%d z:%d\n`",x,y,z);
	}
}

public class Extend11 {
	public static void main(String[] args) {
		Point15 p1 = new Point15();
		p1.pr();
		
		Point15 p2 = new Point15(1000,2000,3000);
		p2.pr();
	}
}
