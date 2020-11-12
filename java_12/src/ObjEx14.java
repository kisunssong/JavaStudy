class Value { //extends Object이 묵시적으로 생략
	int value;
	
	Value(int value) {
		this.value = value;
	}
}


public class ObjEx14 {
	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		
		if(v1.equals(v2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
// 생성자에 값을주고 비교를하면, 주소값을 비교하게된다
		
		v2 = v1; //같은 주소를 가리킴
		
		if(v1.equals(v2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}
}
