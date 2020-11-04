
public class Phone {
	
	//������� ����
	String color;
	String model;
	int price;
	
	/*
	 * ������: �����ڴ� ��ü�� ������ �� �����ؾ��� ������
	 * �ۼ��� �� �ֽ��ϴ�. �����ڴ� �����ؾ߸� ȣ���� �� ������
	 * �����ڸ� �ϳ��� �������� ������� �ڵ����� �⺻�����ڰ� ����˴ϴ�.
	 */
	//������ ����: �������� �̸��� Ŭ���� �̸��� ��/�ҹ��ڱ��� ���ƾ� �մϴ�.
	//�׸��� ��ȯ������ ���� �ʽ��ϴ�.
	Phone() {
//		System.out.println("�����ڰ� ȣ���!!");
		color = "ȸ��";
		model = "�ִ���";
		price = 500000;
	}
	
	/*
	 * ������ �����ε�:
	 * 1. �����ڴ� �ߺ��ؼ� ���� �� ������ �� �ֽ��ϴ�.
	 * 2. ��, �Ű������� ������ ������ �޾ƾ��մϴ�.
	 */
	
	Phone(String pColor) {
		color = pColor;
		model = "ī��";
		price = 250000;
		
	}
	
	Phone(String pColor, String pModel) {
		color = pColor;
		model = pModel;
		price = 900000;
	}
	
	Phone(String pColor, String pModel, int pPrice) {
		color = pColor;
		model = pModel;
		price = pPrice;
	}
	
	//�޼��� ����.
	void info() {
		System.out.println("==========�ڵ��� ����=========");
		System.out.println("����: " + color);
		System.out.println("�÷�: " + model);
		System.out.println("����: " + price);	
		System.out.println("===================");
	}

}
