/*
final�� ���ǵ� �޼���� 
�� �̻� �ڼ�Ŭ�������� �������̵��� ������� �ʴ´�.
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
