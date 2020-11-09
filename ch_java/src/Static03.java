class St03 {
	private static int a=10;
	private int b=10;
	
	public static void p01() {
		System.out.println(a);
	}
	
	public void p02() {
		System.out.println(a);
		System.out.println(this.b);
	}
}


public class Static03 {
	public static void main(String[] args) {
		
		St03.p01(); //클래스명.정적메서드()
		
		St03 s01=new St03();
		St03 s02=new St03();
		
		s01.p01();
		s01.p02();
	}
}
