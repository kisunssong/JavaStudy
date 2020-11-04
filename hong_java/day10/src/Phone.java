
public class Phone {
	
	//멤버변수 선언
	String color;
	String model;
	int price;
	
	/*
	 * 생성자: 생성자는 객체가 생성될 때 실행해야할 로직을
	 * 작성할 수 있습니다. 생성자는 선언해야만 호출할 수 있으며
	 * 생성자를 하나도 선언하지 않을경우 자동으로 기본생성자가 선언됩니다.
	 */
	//생성자 선언: 생성자의 이름은 클래스 이름과 대/소문자까지 같아야 합니다.
	//그리고 반환유형은 적지 않습니다.
	Phone() {
//		System.out.println("생성자가 호출됨!!");
		color = "회색";
		model = "애니콜";
		price = 500000;
	}
	
	/*
	 * 생성자 오버로딩:
	 * 1. 생성자는 중복해서 여러 개 선언할 수 있습니다.
	 * 2. 단, 매개변수의 종류나 개수가 달아야합니다.
	 */
	
	Phone(String pColor) {
		color = pColor;
		model = "카이";
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
	
	//메서드 선언.
	void info() {
		System.out.println("==========핸드폰 정보=========");
		System.out.println("색상: " + color);
		System.out.println("컬러: " + model);
		System.out.println("가격: " + price);	
		System.out.println("===================");
	}

}
