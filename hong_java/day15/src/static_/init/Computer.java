package static_.init;

public class Computer {
	
	public static String company = "LG";
	public static String model = "gram";
	public static String info;
	public int price;
	
	public Computer() {
		System.out.println("�����ڰ� ȣ���!");
		this.price = 1000000;
//		this.info = company + "-" + model; //static�� �ʱ�ȭ�ؼ���
		System.out.println("����: " + price);
	}
	public Computer(String a) {
		System.out.println("�����ڰ� ȣ���!");
		this.price = 500000;
//		this.info = company + "-" + model; //static�� �ʱ�ȭ�ؼ���
		System.out.println("����: " + price);
	}
	
	//���� ������ �ʱ�ȭ�� ���ؼ��� ���� �ʱ�ȭ�ڸ� ����ؾ� �մϴ�.
	static {
		System.out.println("���� �ʱ�ȭ�� ȣ��!");
		info = company + "-" + model;
//		price = 1000000; // static ������ ��� ������
		
	}

}
