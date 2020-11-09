class Point06 {
	protected int x=10;
	protected int y=20;
	
}
class Point07 extends Point06 {
	protected int x=40;
	protected int y=50;
	protected int z=30;
	
	public void p01() {
		System.out.printf("x:%d y:%d z:%d\n",x,y,z);
		System.out.printf("x:%d y:%d z:%d",super.x,super.y,z);
/*
super.인스턴습녀수명 을 사용하는 목적)
부모클래스의 멤버변수명과 자손클래스의 멤버변수명이 같은 경우 부모로 부터 상속받은 변수
명에 접근하고자 할 때 사용한다.
*/
	}
}

public class Extend06 {
	public static void main(String[] args) {
		Point07 p = new Point07();
		p.p01();
	}
}
