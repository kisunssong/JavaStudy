


public class Date03 {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1 == str2 ? "+(str1 == str2));
		//str1 == str2 ? true ->°´Ã¼ºñ±³ ¾Æ´Ô
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		//str1.equals(str2) ? true ->°´Ã¼ºñ±³ ¾Æ´Ô
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
		System.out.println("str3 == str4 ? "+(str3 == str4));
		//str3 == str4 ? false ->°´Ã¼ºñ±³ (== ÁÖ¼Ò°ª)
		System.out.println("str3.equals str4 ? "+(str3.equals(str4)));
		//str3.equals str4 ? true ->°´Ã¼ºñ±³ (equals °ª)
	}
}
