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
	}// �������� Ÿ���� �ٸ��� �� �޼��� �����ε�
}

public class Week16 {
	public static void main(String[] args) {
		
		Wt16 n1 = new Wt16();
		
		System.out.println(n1.abs(-100000L));
		System.out.println(n1.abs(-100));
	}
}
