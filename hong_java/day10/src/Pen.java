
//����� Ŭ����(���̺귯�� Ŭ����)�� ���θ޼��带 �ۼ����� �ʽ��ϴ�.

public class Pen {
	
	//��ü�� �Ӽ��� ��Ÿ���� ���� �ʵ�(��� ����)��� �θ���.
	String color;
	int price;
	
	Pen() {
		
	}
	Pen(String c) {
		
	}
	
	//��ü�� ����� ��Ÿ���� ���� �޼���(��� �Լ�)��� �θ���.
	void write() {
		System.out.println(color + "�� ���� ���ϴ�.");
	}
	
	void info() {
		System.out.println("-------pen's Info-----");
		System.out.println("����: " + color);
		System.out.println("����: " + price);
	}
	
}
