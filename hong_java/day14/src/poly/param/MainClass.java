package poly.param;

public class MainClass {
	
	public static void main(String[] args) {
		
		Driver kim = new Driver();
		
		Ferrari f = new Ferrari();
		
		Sonata s = new Sonata();
		
		Car a = (Car)f;
		
		//drive�� �Ű�����c�� f�� �� > Car c = f ������ > 
		
		kim.drive(f);
		kim.drive(s);
		a.run();
		System.out.println(a);
		
	}

}
