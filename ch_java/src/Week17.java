class Car17 {
	String company = "�����ڵ���";
	String model; //��
	String color; //����
	int maxSpeed; //�ӵ�
	 
	Car17(String model) {
		this(model,"����",250);
	}
	Car17(String model, String color, int maxSpeed) {
		this.model=model; this.color=color; this.maxSpeed=maxSpeed;
	}
	public void info() {
		System.out.println("��: "+model+", ����: "+color+", �ӵ�: "+maxSpeed);
	}
}


public class Week17 {
	public static void main(String[] args) {
		
		Car17 car = new Car17("�ƹݶ�");
		car.info();
	}
}
