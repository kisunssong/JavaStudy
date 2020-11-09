class St02 {
	
	static int a;
	
	public static int getA() {
		return a;
	}
}


public class Static02 {
	public static void main(String[] args) {
		System.out.println(St02.getA());
		
		St02 s01=new St02();
		St02 s02=new St02(); //s01과 s02는 각 객체주소가 다르다.
		
		s01.setA(1000);
		int re=s01.getA();
		System.out.println(re);
		System.out.println(s02.getA());
	}
}
