package poly.param;

public class MainClass {
	
	public static void main(String[] args) {
		
		Driver kim = new Driver();
		
		Ferrari f = new Ferrari();
		
		Sonata s = new Sonata();
		
		Car a = (Car)f;
		
		//drive의 매개변수c에 f가 들어감 > Car c = f 넣은거 > 
		
		kim.drive(f);
		kim.drive(s);
		a.run();
		System.out.println(a);
		
	}

}
