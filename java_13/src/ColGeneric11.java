import java.util.Enumeration;
import java.util.Hashtable;

public class ColGeneric11 {
	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		//<Ű,��>������ ���ڿ��� ���尡��
		ht.put("seoul", "����");
		ht.put("busan", "�λ�");
		ht.put("suwon", "����");
		
		String value = ht.get("seoul"); //Ű��
		if(value != null) {
			System.out.println("seoul: "+value);
		}
		Enumeration<String> en = ht.keys();
		while(en.hasMoreElements()) {
			String k = en.nextElement();// ���ڿ� Ű ����
			String v = ht.get(k);// ���ڿ� �� ����
			System.out.println(k+" : "+v);
		}
	}
}
