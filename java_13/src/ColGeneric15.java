class GenericClass<T> {
	private T value;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
	
	
}

public class ColGeneric15 {
	public static void main(String[] args) {
		GenericClass<Double> obj01 = new GenericClass<Double>();
		//실수숫자값만 저장가능한 컬렉션 제네릭 obj01을 생성. 제네릭 타입으로 기본타입은
		//안되고 참조타입만 가능하다.
		
		obj01.setValue(10.3);
		System.out.println("반환값: "+obj01.getValue());
		
		GenericClass<Integer> obj02 = new GenericClass<>();
		//뒷부분<> 제네릭(지네릭스) 타입은 생략가능 => jdk1.7부터 가능
		obj02.setValue(100);
		int result = obj02.getValue();
		System.out.println("정수반환값: "+obj02.getValue());
		
		GenericClass<String> obj03 = new GenericClass<>();
		obj03.setValue("서울시");
		System.out.println("반환 문자열: "+obj03.getValue());
	}
}
