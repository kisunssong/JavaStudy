package modi.protec.pac2;

import modi.protec.pac1.*;

public class D extends A{
	
	public D() {

//		A a = new A();
//		a.s = "hi";
//		a.method();
		
		/*
		 * pretected 제한자는 패키지가 다를 경우
		 * 두 클래스 사이에 상속관계가 있다면
		 * super를 통한 참조를 허용합니다.
		 */
		super();
		super.s = "hi";
		super.method();
		
		
	}
	

}
