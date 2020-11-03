package collection.list;

import java.util.*;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
// ArrayList��ü ����.
// java1.5���� ���� ���׸� ������ ��. 1.5�Ʒ������� ���� ����
// ���׸� : Ÿ���� ����ȭ�� ���� ��ü ���ο� ����Ǵ� Ÿ���� ��ġ ��Ű�� ���
		// ������Ÿ�� �տ� <String>�� ������ ListŸ�Կ�! String����! �����ϰڴ� ����
		// �����ڿ��� <String>�� ����ϴµ� 1.7 ~ ��������
		// int�� �ϰ� ������ ��üŸ�� <Integer>
		List<String> list = new ArrayList<>();
		
		String str1 = "Java";
		String str2 = "JSP";
		
		System.out.println(list);
		
// list�� ��ü�� �����ϴ� �޼��� add(): �����͸� �� ���� �߰�
		list.add(str1); 
		list.add(str2);
		list.add("DataBase");
		list.add("JDBC");
		list.add("JSP");
		System.out.println(list);
		// []
		// [Java, JSP, DataBase, JDBC, JSP]
		// ListŸ�� Ư¡1: ������� ����ȴ�.
		// ListŸ�� Ư¡2: �ߺ������� ���尡��.
		
// list�� ����� �� ��ü �� ��� size()
		int size = list.size();
		System.out.println("list�� ����� �� ��ü ��: " + size);
		// list�� ����� �� ��ü ��: 5
		// .size();�޼���� int������ ��ȯ �Ѵ�.

// list�� ��ü ���� add(index, ��ü): �����͸� �ش� �ε����� �߰�.
		list.add(2, "Oracle");
		System.out.println(list);
		// [Java, JSP, ����Ŭ, DataBase, JDBC, JSP]
		// 2���ε����� ����Ŭ�� �߰� (�ڵ����� �迭ũ�Ⱑ �þ)

// list[3] = "MySQL"; �̰Ŵ� �迭�����Ҷ�.. �̰Ŵ� ��ü��. �迭�̾ƴϴ�. �޼������ؾ���
// list�� ������ ���� set(index, ��ü): �ε����� ���� ����.
		list.set(3, "MySQL");
		System.out.println(list);
		// [Java, JSP, Oracle, MySQL, JDBC, JSP]
		// 3���ε��� ���� MySQL�� ������.
		
// list ���� ��ü �������� get(index)
		String s = list.get(2);
		System.out.println("2�� �ε��� ��ü: " + s);
		// 2�� �ε��� ��ü: Oracle = ��ü�� �������°Ŵϱ�! Ÿ��(String)�� �°� �ؾ��Ѵ�.
		
// list�� ����� ��ü�� �ε�����ȣ Ȯ���ϱ� indexOf(��ü)
		int idx = list.indexOf("MySQL");
		System.out.println("MySQL �� �ε��� ��ȣ: " + idx);
		// MySQL �� �ε��� ��ȣ: 3 = �ε��� ��ȣ�� int���̱⶧���� intŸ������ ����!!
		
		idx = list.indexOf("�ȳ�");
		System.out.println(idx);
		// indexOf�� ��ü�� �˻����� ������ ��� -1�� ������.!
		// -1
		
// list���� ��ü������ ���� remove(index), remove(obj)
		list.remove(5);
		System.out.println(list);
		// [Java, JSP, Oracle, MySQL, JDBC]
		// 5�� �ε����� ������. (�˾Ƽ� �迭 ũ�⸦ ���δ�)
		
		list.remove(str1);
		System.out.println(list);
		// [JSP, Oracle, MySQL, JDBC]
		// Java ��ü�� ������. (�˾Ƽ� �迭 ũ�⸦ ���δ�)
		
// list ���ο� ����� ������ ���� Ȯ�� ��������.contains
		System.out.println(list.contains("JSP"));
		// true
		System.out.println(list.contains("�ȳ�"));
		// false
		
// list �ݺ��� ó��
		System.out.println("-------------------------");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			// JSP
			// Oracle
			// MySQL
			// JDBC
		}
		System.out.println("-------------------------");
		for(String str : list) {
			System.out.println(str);
			// JSP
			// Oracle
			// MySQL
			// JDBC
		}
		
// list ��ü ����
		list.clear();
		System.out.println(list);
		// []

// list���� �����Ͱ� ���� ����ִ��� Ȯ���ϴ� �޼��� isEmpty(): ������ true, ������ false
		System.out.println(list.isEmpty());
		// true
		
		if(list.isEmpty()) {
			System.out.println("list�� �������");
		}else {
			System.out.println("list�� ������� ����");
		}
		// list�� �������		
	}
}
