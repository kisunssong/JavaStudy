
public class PenMain {

	public static void main(String[] args) {
		
		//Pen의 기능과 속성을 사용하려면
		//설계용 클래스를 로딩시켜 Pen객체를 생성해야 합니다.
		Pen blackPen = new Pen();
		
		//객체의 기능과 속성을 사용하기 위해서는
		//참조 연산자(.)를 사용합니다.
		blackPen.color = "검정";
		blackPen.price = 500;
		
		blackPen.write();
		blackPen.info();
		
		Pen redPen = new Pen();
		redPen.color = "빨강";
		redPen.price = 600;
		
		redPen.write();
		
		System.out.println(redPen);
		System.out.println(blackPen);
		
		//bluePen객체를 생성하여 write()를 호출하여
		//"파랑색 글을 씁니다."를 출력하세요.
		
		Pen bluePen = new Pen();
		bluePen.color = "파랑";
		bluePen.price = 1000;
		
		bluePen.write();
		
		

	}

}
