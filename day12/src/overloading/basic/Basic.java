package overloading.basic;

/*
 * �����ε�(�ߺ�) - �ϳ��� Ŭ���� ���ο� ���� �̸��� ���� �޼��带
 * ���� �� ������ �� �ְ� �ϴ� ����
 * 
 * 1. �Ű� ������ ������ Ÿ���� �޶�� �մϴ�.
 * 2. �Ű� ������ ������ �޶�� ��.
 * 3. �Ű� ������ ������ �޶�� ��.
 * 
 */


public class Basic {
	
	//input(int)
	void input(int a) {
		System.out.println("���� 1���� �Էµ�.");
	}
	
	//input(int)
//	void input(int i) { //�Ű����� Ÿ���� ���Ƽ� ���Ұ�
//		System.out.println("���� 1���� �Էµ�.");
//	}
	
//	String input(int x) { //�Ű����� Ÿ���� ���Ƽ� ���Ұ�
//		
//	}
	
	void input(String s) { 
		System.out.println("���ڿ� 1���� �Էµ�");
	}
	
	void input(int a, int b) {
		System.out.println("���� 2���� �Էµ�.");
	}
	
	void input(String s, double d) {
		System.out.println("���ڿ� 1���� �Ǽ� 1���� �Էµ�.");
	}
	
	void input(double x, String y) {
		System.out.println("�Ǽ� 1���� ���ڿ� 1���� �Էµ�.");
	}
	
	
	

}
