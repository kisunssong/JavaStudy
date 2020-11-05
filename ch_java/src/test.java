class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model=model;
	}
	
	
	public void accel(int speed) {
		if(this.speed >= 150) {
			System.out.println("속도 제한!!");
		}else {
			this.speed = speed;
		}
	}
	
	public void run() {
		for(int i=0; i<300; i+=30) {
			this.accel(i);
			System.out.printf("차량: %s 가 시속 %d 주행중입니다.\n",this.model,this.speed);
		}	
	}
}

public class test {
	public static void main(String[] args) {
		
		Car n1=new Car("소나타");
		n1.run();
	}
}
