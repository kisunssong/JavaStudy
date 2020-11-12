/*
래퍼(Wrapper:  포장) 클래스
자바의 기본 타입 (자료형: Data Type) 8개를 포장해서 클래스화 한것

래퍼 클래스 종류
기본자료형 -> 래퍼 클래스형
byte	Byte
char	Character
short	Short
int		Integer
long	Long
float	Float
double	Double
boolean	Boolean
jdk1.5부터 오토 박싱과 오토언박싱 문법이 추가됨
오토박싱이란 자바 기본타입이 래퍼 클래스형으로 자동형 변환하는 것을 말함
오토언박싱이란 래퍼클래스형이 기본타입으로 바뀌는것을 말함
*/


public class Wrapper17 {
	public static void main(String[] args) {
		
		int n01 = 10;
		int n02;
		Integer num01;
		Integer num02 = new Integer(20);
		num01 = n01; // 오토 박싱
		System.out.println("오토박싱값: "+num01);
		n02 = num02;
		System.out.println("오토언박싱: "+n02);
	}
}
