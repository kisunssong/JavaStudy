import java.util.Vector;

public class ColGeneric17 {
	public static void main(String[] args) {
		
		Vector<String> list = new Vector<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		Vector<? extends Object> objlist;
/*
<? extends Object>�� ���׸� ���ϵ�ī�� ���� Ư¡)
Object�� ��ӹ��� �ڼ����δ� ���׸� Ÿ�� ����ȯ�� ����ϰڴٴ� �ǹ�.
*/
		objlist = list;//String->ObjectŸ������ ��ĳ���� �����ϰ�����<? extends Object>
		for(Object obj : objlist) {
			String a = (String)obj; //�ٿ�ĳ����
			System.out.println(a.toUpperCase()); //�����빮�ں���
		}
	}
}
