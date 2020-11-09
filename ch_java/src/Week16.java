class Wt16 {
	long abs(long a) {
		long b = 0;
		if(a < 0) b=a;
		return b;
	}
	int abs(int a) {
		int b = 0;
		if(a < 0) b=a;
		return b;
	}// 전달인자 타입을 다르게 한 메서드 오버로딩
}

public class Week16 {
	public static void main(String[] args) {
		
		Wt16 n1 = new Wt16();
		
		System.out.println(n1.abs(-100000L));
		System.out.println(n1.abs(-100));
	}
}
