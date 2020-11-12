class Point12 extends Object {
	int x;
	int y;
	
	Point12(){}
	
	Point12(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		String str = "";
		str = "xÁÂÇ¥°ª: "+x+", yÁÂÇ¥°ª: "+y;
		return str;
	}
}


public class ObjEx12 {
	public static void main(String[] args) {
		Point12 p1 = new Point12(100,200);
		System.out.println(p1.toString());
		System.out.println(p1);
		
	}
}
