package static_.init;

public class Computer {
	
	public static String company = "LG";
	public static String model = "gram";
	public static String info;
	public int price;
	
	public Computer() {
		System.out.println("생성자가 호출됨!");
		this.price = 1000000;
//		this.info = company + "-" + model; //static는 초기화해서씀
		System.out.println("가격: " + price);
	}
	public Computer(String a) {
		System.out.println("생성자가 호출됨!");
		this.price = 500000;
//		this.info = company + "-" + model; //static는 초기화해서씀
		System.out.println("가격: " + price);
	}
	
	//정적 변수의 초기화를 위해서는 정적 초기화자를 사용해야 합니다.
	static {
		System.out.println("정적 초기화자 호출!");
		info = company + "-" + model;
//		price = 1000000; // static 변수만 사용 가능함
		
	}

}
