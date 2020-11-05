class Mt12 {
	void p(int a, int b) {
		if(a>b) {
			System.out.println("최대 정수값= "+a);
		}else {
			System.out.println("최대 정수값= "+b);
		}
	}
	void p(double a, double b) {
		if(a<b) {
			System.out.println("최대 실수값= "+b);
		}else {
			System.out.println("최대 실수값= "+a);
		}
	}
}


public class Ex1_01 {
	public static void main(String[] args) {
		
		Mt12 n=new Mt12();
		n.p(12, 15);
		n.p(15.8, 12.8);
	}
}
