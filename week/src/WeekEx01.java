class Point01 { //최고조상 Object
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
}
class Child01 extends Point01 {
	private int z;
	
	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
}

public class WeekEx01 {
	public static void main(String[] args) {
		Child01 ch = new Child01();
		ch.setX(100); //상속 메서드 호출(인자100 -> 매개변수100)
		ch.setY(200); //상속 메서드 호출(인자200 -> 매개변수200)
		ch.setZ(300); //본인 메서드 호출(인자300 -> 매개변수300)
		
		System.out.printf("X좌표:%d Y좌표:%d Z좌표:%d",ch.getX(),ch.getY(),ch.getZ());
		//X좌표:100 Y좌표:200 Z좌표:1000000
	}
}
