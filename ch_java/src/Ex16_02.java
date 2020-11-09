class Parent {
/* 
문제) a,b,c,d 멤버변수 접근제어자를 자손에서 사용할 수 있게 변경함과 동시에
외부폴더 에서는 접근 못하게 하여 선언한다.
*/
	int a;
	int b;
	int c;
	int d;
	
}

class Child16 extends Parent {
	Child16(int a, int b, int c, int d) {
		this.a=a; 
		this.b=b; 
		this.c=c; 
		this.d=d; 
	}
	void info() {
		System.out.printf("a:%d b:%d c:%d d:%d\n",a,b,c,d);
	}	
}
public class Ex16_02 {
	
	public static void main(String[] args) {
		Child16 n1 = new Child16(1,2,3,4);
		n1.info();
/*
문제) 외부객체에서 직접 변수를 호출하지 말고 객체지향과 보안성을 좋게하는 코드로 변경
*/
	}
}
