import java.util.Enumeration;
import java.util.Hashtable;

public class ColGeneric11 {
	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		//<키,값>쌍으로 문자열만 저장가능
		ht.put("seoul", "서울");
		ht.put("busan", "부산");
		ht.put("suwon", "수원");
		
		String value = ht.get("seoul"); //키값
		if(value != null) {
			System.out.println("seoul: "+value);
		}
		Enumeration<String> en = ht.keys();
		while(en.hasMoreElements()) {
			String k = en.nextElement();// 문자열 키 구함
			String v = ht.get(k);// 문자열 값 구함
			System.out.println(k+" : "+v);
		}
	}
}
