
public class Static04 {
	public static void main(String[] args) {
		
		int a=40, b=30, c=10;
		
		int re;
		re=Math.max(a, b);
		System.out.println(a+"와"+b+"중 최대값: "+re);
		re=Math.min(a, b);
		System.out.println(a+"와"+b+"중 최소값: "+re);
		
		System.out.println("원주율 값: "+Math.PI);
		int r=5;
		double area=r*r*Math.PI;//반지름*반지름*원주율=원의 면적
//		int*int*double 자동산술법에 의해서 double*double*double 되어서 연산결과는
//		double타입
		System.out.println("반지름이"+r+"인 원의 면적: "+area);
		
		int[][] arr= {
				{10,20}
		};//자바 프로그램 개발에서는 타입뒤에 대괄호 붙이는 방법을 선호
		int[] arr2[] = {
				{30,40}
		};
		int arr3[][] = {
				{50,60}
		};
	}
}
