package collection.map;
import java.util.*;
// Map - �÷����� Ű(key)�� ��(value)���� ������ entry��ü�� �����ϴ� ������ �������ִ�
// Map - ���� ��� ������ ���庸�ٴ� key�� ���� �����Ҷ� ��(����)�� �����Ҷ� ����

public class HashMapExample{
	public static void main(String[] args) {
		
		
		// ��ü�� ��밡��, Int<<�̷��� �ȵ�.
		Map<String, Integer> map = new HashMap<>();
		
		// map�� ��ü�� ���� put(Key, value)
		map.put("ġŲ", 20000);
		map.put("���", 2000);
		map.put("����", 30000);
		map.put("���", 3000);
		
		System.out.println(map);
		// {����=30000, ġŲ=20000, ���=3000}
		// put�� ����ϸ� �ߺ� �ɶ� ������ ���� �����
		// key��value ���� entry��ü�� �Ѵ�.
		
		System.out.println("map�� ����� �� ��ü ��: " + map.size());
		// map�� ����� �� ��ü ��: 3
		
		
		Integer a = map.get("����");
		int b = map.get("����");
		System.out.println(a);
		System.out.println(b);
		// Value �� integer�̴ϱ� �翬��.. Integer�� �޴´�..
		// ������.. �ڵ� ��ڽ����� int�� �ص��ȴ�.(����Ǯ��)
		// map�� ����� Value�� ��� get(key)
		// 30000 //
		
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		// [����, ġŲ, ���]
		// ���� key�� Ÿ���� String��
		// map���� key�� ���� �����ϴ� �޼��� keySet()
		
		Iterator<String> kIter = kSet.iterator();
		System.out.println("-------------------------");
		
		while(kIter.hasNext()) {
			String foodName = kIter.next();
			int foodPrice = map.get(foodName);
			System.out.printf("%s�� ������ %d�� �Դϴ�.\n", foodName, foodPrice);
			// ������ ������ 30000�� �Դϴ�.
			// ġŲ�� ������ 20000�� �Դϴ�.
			// ����� ������ 3000�� �Դϴ�.
		}
		
		String food = "����";
		if(map.containsKey(food)) {
			System.out.println(food + "�� ������" + map.get(food));
		}else {
			System.out.println(food + "�� ���� �޴� �Դϴ�.");
		}
		// map���ο� �ִ� key�� ������ Ȯ���ϴ� �޼��� containskey()
		// ������ ���� �޴� �Դϴ�.
		// ����Ÿ���� boolean
		
		
		map.remove("ġŲ");
		System.out.println(map);
		// map ���� ������ ���� remove(key)
		// {����=30000, ���=3000}
		// �ش� key�� �����ϴ� Entry��ü�� ����. �ѽ��̶� ���̻����ȴ�
		
		map.clear();
		
		if(map.isEmpty()) {
			System.out.println("map�� �������");
		}else {
			System.out.println("map�� ������� ����");
		}
		// map�� �������
		
	
	}
}
