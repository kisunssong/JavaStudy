
import java.util.*;

// List<������Ÿ��> ���� = new ArrayList<>();
// - �߰� ��ȣ �����Ҷ� �� �ε����� ������ ���ܾߵǼ� �ð��� �����ɸ�
// List<������Ÿ��> ���� = new LinkedList<>();
// �ε��� ���� ���̿� ��ũ�� �����س���, �����Ҷ� ���� �ε��� �յ� ������� �����, ����������

// set - �ߺ� ���� �� ���Ѵ�. 
// set - �� ���� �Ѵ�.
// set - ������ ã�µ� �����ɸ���.



// ��ȣ ����(List), �̸� ����(Set), ���� ����(Map) �̷��� ����?
public class SetListMapList {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		// set�� ��ü�� �߰� add()
		set.add("�߰���");
		set.add("���");
		set.add("�踻��");
		set.add("�ܹ���");
		set.add("���");
		
		// set�� ����� ��ü�� ���� �˾ƺ��� �޼��� Size()		
		System.out.println("set�� ����� ��ü ��: " + set.size());
		System.out.println(set);
		// set�� ����� ��ü ��: 4 //
		// [���, �踻��, �ܹ���, �߰���] //
		// setƯ¡1 : ���<< �ߺ��Ǽ� ����� ����. 
		// setƯ¡2 : ���� ������ �ȵ�.
		
		// set�� ��ü �����͸� ����Ϸ��� �ݺ���(Iterator)�� ���� ��� ��ü��
		// ������� �ѹ��� �ݺ��ؼ� ������ �մϴ�.
		
		Iterator<String> iter = set.iterator();
		// Ÿ�Կ� �°� ������
		String s = iter.next();
		System.out.println(s);		
		// ��� //
		
		s = iter.next();
		System.out.println(s);
		// �踻�� //
		
		s = iter.next();
		System.out.println(s);
		// �ܹ��� //
		
		s = iter.next();
		System.out.println(s);
		// �߰��� //
//		s = iter.next(); // ���� ���� ���� ������ �����߻��Ѵ�.
		System.out.println("=====================");
		
		
		
		// hasNext�� ���� ã���� ������.. false�� ������
		// �ݺ��� ��ü�� next()�޼��带 ���� set ������ �����͸�
		// �ݺ������� �� ���̻� ��ȸ�� �����Ͱ� ������ ���ܸ� �߻���Ű�� ������
		// hasnext()�� ���� �� �̻� �Ҹ��� �����Ͱ� �ִ����� ������ üũ
//		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			
//			if(s.equals("�߰���"))
			System.out.println(iter + "�� ���־�");
			break;
		}
		
		//set�� ������ ���� ��� remove(), clear()
		set.remove("�ܹ���");
		System.out.println(set);
		// [���, �踻��, �߰���]
		
		set.clear();
		//��ü Ŭ����
		// set - �� �ټ��� �����͸� ���� �����Ҷ� ����
		if(set.isEmpty()) {
			System.out.println("set�� �������.");
		}else {
			System.out.println("set�� ������� ����.");
		}

		

		
		
	}

}
