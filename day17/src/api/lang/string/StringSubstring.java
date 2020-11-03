package api.lang.string;

public class StringSubstring {
	
	public static void main(String[] args) {
		
		String ssn = "040404-3412343";
		System.out.println(ssn);
		
		//7번 인덱스부터 전부 출력
		String last = ssn.substring(7);
		System.out.println(last);
		
		//0번 인덱스부터 6번 아래까지 전부 출력
		String first = ssn.substring(0, 6);
		System.out.println(first);
		
	}

}
