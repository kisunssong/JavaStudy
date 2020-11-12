
public class ObjEx13 {
	public static void main(String[] args) {
		
		int a = 10,  b = 10;
		
		if(a == b) {
			System.out.println("같다");
		}else {
			System.out.println("다르다.");
		}
		
		String pwd01 = new String("5678");
		String pwd02 = new String("5678");
		
		if(pwd01 == pwd02) {
			System.out.println("비번이 같다");
		}else {
			System.out.println("비번이 다르다.");
		}
		
		if(pwd01.equals(pwd02)) {
			System.out.println("비번이 같다");
		}else {
			System.out.println("비번이 다르다.");
		}
		
		String pwd03 = pwd01;
		if(pwd01 == pwd03) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다");
		}
	}
}
