
public class ObjEx13 {
	public static void main(String[] args) {
		
		int a = 10,  b = 10;
		
		if(a == b) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���.");
		}
		
		String pwd01 = new String("5678");
		String pwd02 = new String("5678");
		
		if(pwd01 == pwd02) {
			System.out.println("����� ����");
		}else {
			System.out.println("����� �ٸ���.");
		}
		
		if(pwd01.equals(pwd02)) {
			System.out.println("����� ����");
		}else {
			System.out.println("����� �ٸ���.");
		}
		
		String pwd03 = pwd01;
		if(pwd01 == pwd03) {
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���");
		}
	}
}
