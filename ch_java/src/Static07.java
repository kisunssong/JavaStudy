
public class Static07 {
	
	static int count = 0; // 생산된 총 제품대수를 저장하기 위한 정적변수
	int serialNo; // 0초기값, 각 생산된 제품의 고유한 시리얼 제품번호
	
	{
		++count; //총 제품대수를 카운터
		serialNo = count;
	}// 인스턴스 변수 초기화블록: 제품이 생산될때 마다 실행
		
	public static void main(String[] args) {
		
		Static07 s1 = new Static07(); //기본생성자 호출시,먼저 인스턴스 초기화블록 실행
		Static07 s2 = new Static07();
		Static07 s3 = new Static07();
		
		System.out.println("s01 제품 시리얼 번호: "+s1.serialNo);
		System.out.println("s01 제품 시리얼 번호: "+s2.serialNo);
		System.out.println("s01 제품 시리얼 번호: "+s3.serialNo);
		System.out.println("전체 생산된 개수: "+Static07.count);
		
/*
정적변수를 사용하는 목적은 생산도니 모든 제품에 의해서 공유하고자 하는 값이 있는경우
사용한다. 대표적으로 총 제품 생산대수
*/

	}	
}
/*
s01 제품 시리얼 번호: 1
s01 제품 시리얼 번호: 2
s01 제품 시리얼 번호: 3
전체 생산된 개수: 3
*/
