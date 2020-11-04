
public class FloatExample {

	public static void main(String[] args) {
		
		float f1 = 7.12345F;
		double d1 = 7.12345;
		System.out.println(f1);
		
		float f2 = 1.234567891234F;
		double d2 = 1.234567891234;
		System.out.println("------------------");
		System.out.println(f2); //소수점 7자리까지표현
		System.out.println(d2); //소수점 15자리까지표현
		
//		2132121344123  | 732123213121
//		2.1321 x 10^14 | 7.3212 x 10^13
//		2.1321 x e^14  | 7.3212 x e^13 // e -> 10진수
		float f3 = 3.1415e6F; //3.1415 x 10^6승
		double d3 = 2.213e-3; //2.213 x 10^-3승
		System.out.println("--------------------");
		System.out.println(f3);
		System.out.println(d3);
		

	}

}
