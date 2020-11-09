class Point10 {
	protected int x=10;
	protected int y=20;
		
	public Point10 (int x, int y) {
		this.x=x; this.y=y;
		System.out.printf("부모의생성자: x:%d y:%d\n",x,y);
	}//전달인자 개수가 다른 생성자가 오버로딩되면 자바컴파일러는 더이상 기본생성자를
//묵시적으로 제공하지 않는다.
}

class Point11 extends Point10 {
	protected int z = 30;	
	
	public Point11 (int x, int y) {
		super(x,y);
		System.out.println("자손 클래스 호출!");
	}
	
}


public class Extend08 {
	public static void main(String[] args) {
		Point11 p = new Point11(4,5);
		
	}
}
