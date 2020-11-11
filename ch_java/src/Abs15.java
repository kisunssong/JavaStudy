/*
final로 정의된 메서드는 
더 이상 자손클래스에서 오버라이딩을 허용하지 않는다.
*/
class FinalMethod15 {
	String str = "Java";
	
	final void setStr(String str) {
		this.str = str;
	}
	void p() {
		System.out.println(str);
	}
}
class FinalEx extends FinalMethod15 {
	@Override
	void setStr(String str) {
		
	}
}

public class Abs15 {
	public static void main(String[] args) {
		
	}
}
