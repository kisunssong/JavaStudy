package modi.member.pac2;

import modi.member.pac1.A;

public class C {
	
	public C() {
		
		A a = new A();
		
		a.a = 1; //public(O)
//		a.b = 2; //p.f(X)
//		a.c = 3; //private (X)
		
		a.method1(); //public(O)
//		a.method2(); //p.f(X)
//		a.method3(); //private(X)
		
	}

}
