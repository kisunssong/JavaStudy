class Car17 {
	String company = "현대자동차";
	String model; //모델
	String color; //색상
	int maxSpeed; //속도
	 
	Car17(String model) {
		this(model,"은색",250);
	}
	Car17(String model, String color, int maxSpeed) {
		this.model=model; this.color=color; this.maxSpeed=maxSpeed;
	}
	public void info() {
		System.out.println("모델: "+model+", 색상: "+color+", 속도: "+maxSpeed);
	}
}


public class Week17 {
	public static void main(String[] args) {
		
		Car17 car = new Car17("아반떼");
		car.info();
	}
}
