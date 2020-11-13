
public class Date04 {
	public static void main(String[] args) {
		String s = "Hello";
		char c = s.charAt(1); 
		//첫문자 0부터 : e
		
		String n = "0123456";
		char c2 = n.charAt(2);
		//첫문자 0부터 : 2
		
		boolean result = s.equalsIgnoreCase("HELLO");
		//영문대소문자를 구분안함 : true
		
		result = s.equals("HELLO");
		//영문대소문자를 구분 : false
		
		int idx4 = s.indexOf('o');
		//hello : 0부터시작 : 4
	}
}
