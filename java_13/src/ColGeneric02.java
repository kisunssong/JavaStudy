import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
java.util ��Ű���� �÷��� �������̽� Set�� ������ �÷��� Ŭ���� HashSetƯ¡)
1. �ߺ� ���Ұ� ������� �ʰ�, ���� ���� ����ȴ�.
*/
public class ColGeneric02 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(12); 
		set.add("ȫ�浿"); 
		set.add("ȫ�浿"); //�ߺ�����ȵ�
		set.add(10.3);
		set.add(true);
		System.out.println("�÷��� ũ��: "+set.size());
		//[ȫ�浿, 12, 10.3, true] ����������
		System.out.println(set); //�÷��� ���Ұ� ���
		
/*
java.util��Ű���� �÷��� �������̽� List�� ������ �÷��� Ŭ���� ArrayListƯ¡)
1. jdk1.2���� �߰�, �����ְ� ����, �ߺ����Ұ� ���
2. ������ ũ��
*/
		List list = new ArrayList();
		list.add(100);
		list.add("ȫ�浿");
		list.add("ȫ�浿");
		list.add(10.3);
		list.add(false);
		System.out.println("���Ұ���(�÷���ũ��): "+list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(" "+list.get(i));
		}
	}
}
