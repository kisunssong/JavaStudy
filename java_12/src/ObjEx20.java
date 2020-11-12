
import java.util.StringTokenizer;
public class ObjEx20 {
	public static void main(String[] args) {
		
		String phone="010-777-9999";
		StringTokenizer ph = new StringTokenizer(phone,"-");
/*
1. - 구분자를 기준으로 폰번호를 분리한다. 분리된 폰번호를 토큰 문자열이라고 한다.
2. 웹사이트 개발에서 회원정보 수정창에서 많이 활용된다.
3. 010(0)777(1)9999(3) index로 나눠진다
*/
		
		String ph01 = ph.nextToken();//첫번째 분리된 폰번호
		String ph02 = ph.nextToken();//두번째 분리된 폰번호
		String ph03 = ph.nextToken();//세번째 분리된 폰번호
		
		System.out.println("첫번째 폰번호: "+ph01);
		System.out.println("두번째 폰번호: "+ph02);
		System.out.println("세번째 폰번호: "+ph03);
	}
}
/*
첫번째 폰번호: 010
두번째 폰번호: 777
세번째 폰번호: 9999
*/