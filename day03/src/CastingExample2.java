
public class CastingExample2 {

	public static void main(String[] args) {
		
		int i = 72;
		char c = (char)i; 
		//char(2) -> int(4)로는 크기 차이가 있어 안됨
		//값에 (char)써주면 강제로 char타입으로 변환
		System.out.println("72의 유니코드문자: " + c);
		
		double d = 4.83123;
		int j = (int)d;
		System.out.println(j);
        //double -> int로 강제변환시 소수점이 전부 날아감
		
		int k = 1000;
		byte b = (byte)k;
		System.out.println(b);
		//강제 형 변환시 주의점은 해당 데이터 타입이 받아들일 수 있는 범위가 아닌
		//데이터가 들어오면 오버플로, 언더플로가 일어납니다.
	}

}
