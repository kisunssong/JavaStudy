package api.lang.string;

public class StringSubstring {
	
	public static void main(String[] args) {
		
		String ssn = "040404-3412343";
		System.out.println(ssn);
		
		//7�� �ε������� ���� ���
		String last = ssn.substring(7);
		System.out.println(last);
		
		//0�� �ε������� 6�� �Ʒ����� ���� ���
		String first = ssn.substring(0, 6);
		System.out.println(first);
		
	}

}
