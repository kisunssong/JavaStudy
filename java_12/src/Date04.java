
public class Date04 {
	public static void main(String[] args) {
		String s = "Hello";
		char c = s.charAt(1); 
		//ù���� 0���� : e
		
		String n = "0123456";
		char c2 = n.charAt(2);
		//ù���� 0���� : 2
		
		boolean result = s.equalsIgnoreCase("HELLO");
		//������ҹ��ڸ� ���о��� : true
		
		result = s.equals("HELLO");
		//������ҹ��ڸ� ���� : false
		
		int idx4 = s.indexOf('o');
		//hello : 0���ͽ��� : 4
	}
}
