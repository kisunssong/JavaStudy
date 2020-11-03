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
			System.out.println("속도를 더 이상 올릴 수 없습니다.");
		}else {
			this.speed = speed;
		}
	}
	
	void run(int maxSpeed) {
		for(int i=0; i<=maxSpeed; i+=30) {
			this.accel(i);
			System.out.printf("%s가 달립니다.(시속: %dkm/h)\n"
				, this.model, this.speed);
		}
	}

}
