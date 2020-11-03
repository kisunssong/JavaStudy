import java.util.Scanner;

public class Test {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하세요: ");
		int score = scan.nextInt();
		
		if (score > 100) {
			System.out.println("잘못된 점수 입니다.");
		}else if (score == 100) {
			System.out.println("100점 만점 입니다.");
		}else if (score >= 95) {
			System.out.println("A+ 학점 입니다.");
		}else if (score >= 90) {
			System.out.println("A 학점 입니다.");
		}else if (score >= 85) {
			System.out.println("B+ 학점 입니다.");
		}else if (score >= 80) {
			System.out.println("B 학점 입니다.");
		}else if (score >= 75) {
			System.out.println("C+ 학점 입니다.");
		}else if (score >= 70) {
			System.out.println("C 학점 입니다.");
		}else {
			System.out.println("재수강 하셔야 합니다.");
		}
		scan.close();
	}
	
	
		

}
/*
학점계산기
100점 초과 : 잘못된 점수 입니다.
100점 : 만점입니다.
~ 95점 : A+ 학점입니다.
~ 90 점 : A학점입니다.
~ 85 점 : B+학점입니다.
~ 80 점 : B학점입니다.
~ 75 점 : C+학점입니다.
~ 70 점 : C학점입니다.
~ 0 점 : 재수강 대상 입니다.
*/







//public static void main(String[] args) {
//
//Scanner scan = new Scanner(System.in);
//System.out.println("학점을 입력하세요 : ");
//int num = scan.nextInt();
//if (num>100) {
//	System.out.println("100점 만점입니다.");
//}else if (num>95) { 
//	System.out.println("A+ 학점 입니다.");
//}else if (num%90==95) {
//	System.out.println("A 학점 입니다.");
//}else if (num%85==90) {
//	System.out.println("B+ 학점 입니다.");
//}else if (num%80==85) {
//	System.out.println("B 학점 입니다.");
//}else if (num%75==80) {
//	System.out.println("C+ 학점 입니다.");
//}else if (num%70==75) {
//	System.out.println("C 학점 입니다.");
//}else {
//	System.out.println("재수강 대상 입니다.");
//}
//}