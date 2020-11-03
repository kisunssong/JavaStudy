package exception.runtime;

public class NullPointerExample {

	public static void main(String[] args) {
		
		String str = null;
		str = "hello";
		System.out.println(str.toUpperCase());
	}
}
