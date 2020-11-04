package modi.protec.pac1;

public class B {
	
	public B() {
		
		
		//protected는 같은 패키지라면 접근이 가능
		A a  = new A();
		a.s = "hi";
		a.method();
		
	}

}
