class Point16 {
	int x, y;
	
	Point16() {}
	
	Point16(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		Point16 ptTmp = (Point16)obj;
		
		if((x == ptTmp.x) && (y == ptTmp.y)) {
			return true;
		}else {
			return false;
		}
	}
}


public class ObjEx16 {
	public static void main(String[] args) {
		Point16 pt01 = new Point16(10,20);
		Point16 pt02 = new Point16(10,20);
		
		if(pt01 == pt02) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(pt01.equals(pt02)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}
}
