import java.util.ArrayList;
import java.util.List;

public class ColGeneric10 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("seoul"); // ObjectŸ������ ��ĳ�����ϸ鼭 ����
		list.add("busan"); // ObjectŸ������ ��ĳ�����ϸ鼭 ����
		list.add("Incheon"); // ObjectŸ������ ��ĳ�����ϸ鼭 ����
		
		String result;
		for(int i=0; i<list.size(); i++) {
			result = (String)list.get(i); //�ٿ�ĳ������
			System.out.println(result.toUpperCase()); //���ڿ� �빮�ڷ� ��ȯ
		}
		System.out.println("========================");

// �÷����� ���� �������� �ڷ����� ���� ����Ǵ� ���� �ڷ��� �������� ��������, ���ϴ�
// �ڷ��� �� ���⵵ ��ƴ�. �׷��� ���� ������ ���׸��̴�.
// �÷��ǿ� ���׸��� �����ϸ� ������ �ڷ��� Ÿ�԰��� ���尡���ϴ�. �׷��� ���ʿ��� ��/�ٿ�
// ĳ������ �� �ʿ䰡 ����.
		String a;
		List<String> list1 = new ArrayList<String>();
		list1.add("hong");
		list1.add("kim");
		list1.add("lee");
		for(int i=0; i<list1.size(); i++) {
			a = list1.get(i);
			System.out.println(a);
		}
	}
}
