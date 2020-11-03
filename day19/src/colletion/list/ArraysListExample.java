package colletion.list;

import java.util.*;

public class ArraysListExample {
	
	public static void main(String[] args) {
		
		// ArrayList��ü ����.
		// �پ��� List�� ����Ҳ��� Ŭ�����θ��� List�� �ص��ȴ�
				
		// ���׸�(generic): Ÿ���� ����ȭ(��������)�� ���� ��ü ���ο�
		// ����Ǵ� Ÿ���� ��ġ��Ű�� ���.
		// ArrayList list = new ArrayList();
		// List list = new ArrayList();
		// �ڹ�1.8 �� �����ڿ� ����Ǵµ�, �����Ϲ����� �����ڿ�<String>�߰�
		List<String> list = new ArrayList<String>();
		
		String str1 = "Java";
		String str2 = "JSP";
		
		System.out.println(list); //�ƹ��͵�����.
		// []
		
		//list�� ��ü�� �����ϴ� �޼��� add(); �����͸� �� ���� �߰�
		list.add(str1);
		list.add(str2); // JSP�ߺ� ���� ��.
		list.add("DataBase");
		list.add("JDBC"); 
		list.add("JSP"); // JSP�ߺ� ���� ��.
		System.out.println(list); //�߰���
		// [Java, JSP, DataBase, JDBC, JSP]
		
		// list��  ����� �� ��ü �� ��� size()
		// .size(); �� length�� ����. ��ü�� ��� �������� ���س��⶧����.
		int size = list.size(); 
		System.out.println("list�� ����� �� ��ü ��: " + size);
		
		//list�� ��ü ���� add(index, ��ü); �����͸� �ش� �ε����� ����.
		//2�� �ε����� "Oracle"�� �߰��ض�
		list.add(2, "Oracle");
		System.out.println(list);
		
		//list ������ ���� set(index, ��ü)
		//3�� �ε����� "MySQL"�� ��ü�ض� 
		list.set(3,  "MySQL");
		System.out.println(list);
		
		//list ���� ��ü �������� get(index)
		//���ϰ��� String�̶� String������ ����
		String a = list.get(2);
		System.out.println("2�� �ε��� ��ü: " + a);
		
		//list�� ����� ��ü�� �ε�����ȣ Ȯ���ϱ� indexOf(��ü)
		int b = list.indexOf("MySQL");
		System.out.println("MySQL �ε��� ��ȣ: " + b);
		
		//indexOf�� ��ü�� �˻����� ������ ��� -1�� ���� �մϴ�.
		int c = list.indexOf("����");
		System.out.println(c);
		
		//list���� ��ü������ ���� remove(index), remove(obj)
		//5�� �ε��� ����
		list.remove(5);
		System.out.println(list);
		
		//���� ������ �ȴ�. "Oracle" �̷��͵� ����
		list.remove(str1);
		System.out.println(list);
		
		//list���ο� ����� ��ü�� ����Ȯ��.
		//contains()
		System.out.println(list.contains("JSP")); //true
		System.out.println(list.contains("Oracle")); //true
		System.out.println(list.contains("������")); //false
		
		//list�� �ݺ��� ó��
		//i�ʱⰪ�� �ε����� ���, list.size 1������ �����̴�, < �Ʒ�����´�
		System.out.println("==========================");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("==========================");
		
		//��~~������
		list.clear();
		System.out.println(list);
		
		//list���� �����Ͱ� ���� ����ִ��� Ȯ���ϴ� �޼��� isEmpty()
		if(list.isEmpty()) {
			System.out.println("list�� �������.");
		}else { 
			System.out.println("list�� ����");
		}
	}
}
