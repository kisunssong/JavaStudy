class St01 {
	static int a=10; //static 키워드로 정의된 a를 정적변수(클래스 변수)라고 한다.
// 정적변수는 해당클래스로 직접 접근한다. St01.a
	int b=20; //b는 인스턴스 변수. 인스턴스는 객체와 같은 의미이다. 생성된 각 객체
// 에 의해서 메모리 주소를 따로 관리해서 값을 따로 저장한다.
/*
클래스 소속의 멤버변수 종류)
1. 정적변수(클래스 변수)
2. 인스턴스변수
*/
}


public class Static01 {
	public static void main(String[] args) {
		System.out.println("St01 정적변수a: "+St01.a);
		
		St01 s01=new St01();
		St01 s02=new St01();
		
		System.out.println("s01 인스턴스 변수b: "+s01.b);
		System.out.println("s02 인스턴스 변수b: "+s02.b);
		System.out.printf("s01 인스턴스 변수b: %d, St01 정적변수a: %d\n",s01.b,St01.a);
		System.out.printf("s02 인스턴스 변수b: %d, St02 정적변수a: %d\n",s01.b,St01.a);
	}
}
