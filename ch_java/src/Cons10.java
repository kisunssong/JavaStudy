class Car10 {
	private String color; //차색상
	private String gearType; //변속기 종류 -> auto(자동), manual(수동)
	private int door; //문의 개수
		
	
	private Car10() {
	}
	private static Car10 n=new Car10();
	
	public static Car10 add() {
		return n;
	}
	
	Car10(String color, String gearType, int door) {
		this.color=color; this.gearType=gearType; this.door=door;
	}
	public void info() {
		System.out.printf("색상: %s, 기어: %s, 문개수: %d\n"
						 ,this.color,this.gearType,this.door);
	}

}

public class Cons10 {
	public static void main(String[] args) {
		
//		Car10 c01=new Car10();
//		c01.color="white";
//		c01.gearType="auto";
//		c01.door=4;
//		
//		System.out.println("색상: "+c01.color+", 기어: "+
//		c01.gearType+", 문개수: "+c01.door);
//		
//		Car10 c02=new Car10("red","manual",6);
//		System.out.println("색상: "+c02.color+", 기어: "+
//				c02.gearType+", 문개수: "+c02.door);
/*
문제) 위의 자바 코드를 보시고 더 좋은 OOP 객체지향 프로그램밍 문법을 적용해서
변경해 본다.
*/
		System.out.println("==========================");
		Car10 c03=new Car10("blue","auto",6);
		c03.info();		
		Car10 c04=new Car10("red","메뉴얼",10);
		c04.info();		
	}
}
