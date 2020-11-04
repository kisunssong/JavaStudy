
public class Hong_BreakExample4 {
	
	public static void main(String[] args) {
		
		//'A'는 유니코드 숫자:65
		//'B'는 유니코드 숫자:66
		//'A' ~ 'Z'까지 연산
		
		/*
		 * 내부 반복문에서 break를 사용하여 바깥쪽 반복문까지
		 * 한번에 탈출시키려면 외부 반복문에 label을 붙입니다.
		 */
		
		u_case: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				//lower f까지만 출력함
				//u_case를 붙이면 한방에 최초for문까지 탈출됨
				if(lower == 'f') break u_case;
			}
			
		}
	}

}
