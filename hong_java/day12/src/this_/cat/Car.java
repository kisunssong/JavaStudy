package this_.cat;

public class Car {
	
	String model;
	int speed;
	
	Car() {
		
	}
	
	Car(String model) {
		this.model = model;
	}
	
	void accel(int speed) { 
		if(this.speed >= 150) {
			System.out.println("�ӵ��� �� �̻� �ø� �� �����ϴ�.");
		}else {
			this.speed = speed;
		}
	}
	
	void run(int maxSpeed) {
		for(int i=0; i<=maxSpeed; i+=30) {
			this.accel(i);
			System.out.printf("%s�� �޸��ϴ�.(�ü�: %dkm/h)\n"
				, this.model, this.speed);
		}
	}

}
