class Car10 {
	private String color; //������
	private String gearType; //���ӱ� ���� -> auto(�ڵ�), manual(����)
	private int door; //���� ����
		
	
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
		System.out.printf("����: %s, ���: %s, ������: %d\n"
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
//		System.out.println("����: "+c01.color+", ���: "+
//		c01.gearType+", ������: "+c01.door);
//		
//		Car10 c02=new Car10("red","manual",6);
//		System.out.println("����: "+c02.color+", ���: "+
//				c02.gearType+", ������: "+c02.door);
/*
����) ���� �ڹ� �ڵ带 ���ð� �� ���� OOP ��ü���� ���α׷��� ������ �����ؼ�
������ ����.
*/
		System.out.println("==========================");
		Car10 c03=new Car10("blue","auto",6);
		c03.info();		
		Car10 c04=new Car10("red","�޴���",10);
		c04.info();		
	}
}
