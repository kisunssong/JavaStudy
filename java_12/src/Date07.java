
public class Date07 {
	public static void main(String[] args) {
		
		String s = " Hello Java ";
		int a = s.length();
		//문자열 개수 반환. 공백 포함. 첫 문장 시작 1 : 12
		int length = s.trim().length();
		System.out.println(length);
		//trim()양쪽 공백을 제거하고 length()길이 반환 : 10
		
		String fullName = "Hello.java";
		int index = fullName.indexOf('.');
		//'.'단일문자를 맨 왼쪽부터 찾아서 가장 먼저 나오는 문자 
		//기준으로 왼쪽부터 카운트해서 반환 첫 문장 시작 0 : 5
		
		String b = "Hello.java";
		int index1 = b.indexOf('.');
		String b1 = b.substring(0,index1);
		//index1 왼쪽기준 '.'까지 : 5
		//b1 0부터, 5 바로 아래까지 : Hello
		
		int index2 = b.indexOf('j');
		String b2 = b.substring(index1+1);
		String b3 = b.substring(index2);
		//index1 : 5+1 = 6 번부터 출력 : java
		//index2 : j = 6 번부터 출력 : java
		
	}
}
