class TestClass14 {
	private Object value;
	
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}	
}


public class ColGeneric14 {
	public static void main(String[] args) {
		TestClass14 obj01 = new TestClass14();
		obj01.setValue(10); // 오토박싱과 업캐스팅
		System.out.println("반환값: "+obj01.getValue());
		
		obj01.setValue(10.3); //오토박싱과 업캐스팅
		System.out.println("반환값: "+obj01.getValue());
		
		obj01.setValue("apple"); //문자열 String참조타입이므로 오토박싱문법은 제외
		//하고 업캐스팅만 됨.
		
		/*
		 * 문제 instanceof 연산자를 추가한다.
		 */
		
		if(obj01.getValue() instanceof String) {
			//return값이 Object타입이라 String으로 다운형변환 가능한지..되면 true
			String temp = (String)obj01.getValue(); 
			System.out.println("된다");
			System.out.println("영문대문자: "+temp.toUpperCase());
		}else {
			System.out.println("안된다");
		}
		 //사전에 업캐스팅을 한것이 한해서 명시적인
		//다운캐스팅
	}
}
