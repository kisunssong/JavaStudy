package api.lang.string;

public class StringReplace {
	
	public static void main(String[] args) {
		
		String str1 = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		
		//"�ڹ�"�� ã�Ƽ�, "JAVA"�� �� �ٲ������
		String str2 = str1.replace("�ڹ�", "JAVA");
		System.out.println(str1);
		System.out.println(str2);		
	}
}
