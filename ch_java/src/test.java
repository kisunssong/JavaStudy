class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model=model;
	}
	
	
	public void accel(int speed) {
		if(this.speed >= 150) {
			System.out.println("�ӵ� ����!!");
		}else {
			this.speed = speed;
		}
	}
	
	public void run() {
		for(int i=0; i<300; i+=30) {
			this.accel(i);
			System.out.printf("����: %s �� �ü� %d �������Դϴ�.\n",this.model,this.speed);
		}	
	}
}

public class test {
	public static void main(String[] args) {
		
		Car n1=new Car("�ҳ�Ÿ");
		n1.run();
	}
}
