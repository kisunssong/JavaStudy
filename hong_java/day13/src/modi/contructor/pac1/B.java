package modi.contructor.pac1;

public class B {
	
	A a1 = new A(false); //public제한자 생성자 호출(O)
	A a2 = new A(55); //p.f제한자 생성자 호출(O)
//	A a3 = new A("안녕"); //private 생성자 호출(X)

}
