
public class Date05 {
	public static void main(String[] args) {
		
		String s = "java.lang.Object";
		int idx1 = s.lastIndexOf('.');
		//'.'를 맨 오른쪽부터 찾아서 가장 먼저 나오는 위치번호를 
		//왼쪽부터 카운트 해서 반환. 첫문자 0부터 시작 : int 9 반환
		
		int idx2 = s.indexOf('.');
		//'.'를 왼쪽부터 찾아서 가장먼저 나오는 위치번호를
		//왼쪽부터 카운트 해서 반환. 첫문자 0부터 시작 : 4
		
		String s2 = "Hello";
		int length = s2.length();
		//문자열 길이를 반환. 첫문자 1부터 시작 : 5
		
		String s3 = s2.replace("H", "C");
		//Hello에서 H를 C로 변경(대소문자구분함) : Cello
	}
}
