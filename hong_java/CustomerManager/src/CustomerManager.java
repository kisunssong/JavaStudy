import java.util.Arrays;
import java.util.Scanner;

public class CustomerManager {
	
	//프로그램 전체에서 사용할 변수들은 클래스 블록 바로 아래에 선언합니다.
	//static이 붙은 블록에서는 static변수와 static메서드만 사용할 수 있음.
	
	static String[] nameList = new String[100];
	static char[] genderList = new char[100];
	static String[] emailList = new String[100];
	static int[] birthList = new int[100];
	
	
	//현재 고객 데이터가 몇 명 저장되었는지 알기 위한 변수 count 선언
	static int count = 0;
	
	//배열의 인덱스를 조작하기 위해 인덱스를 변수화 시킴.
	//배열의 인덱스는 0번부터 출발하므로 초기값을 0바로 이전값인 -1로
	//세팅하여 초기에 next를 실행했을 때 인덱스가 0이되어 첫번째 고객를
	//조회하기 위함.
	static int index = -1;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("\n[INFO] 고객 수: " + count
					+ ", 인덱스: " + index);
			System.out.println("메뉴를 입력하세요. ");
			System.out.println("(I)nsert, (P)revious, "
					+ "(N)ext, (C)urrent, (U)pdate, "
					+ "(D)elete, (Q)uit");
			System.out.printf("메뉴 입력: ");
			String menu = scan.next(); //입력값이 menu로 들어감
			menu = menu.toLowerCase(); //대.소문자 구분없이 만들어버림
			char m = menu.charAt(0); //0번째 인덱스, 즉 0번째 인덱스 한글자
			
			switch(m) {
			case 'ㅑ': //break를 걸지않아서 바로 실수로 ㅑ쳐도 i로 내려감
			case 'i':
				System.out.println("고객 정보 입력을 시작합니다.");
				insertData();
				System.out.println("고객정보가 정상적으로 입력되었습니다.");
				break;
			case 'ㅔ':
			case 'p':
				System.out.println("\n이전 정보를 시작합니다.");
				if(index<=0) {
					System.out.println("이전 고객정보가 존대하지 않습니다.");
				}else {
				index--;
				printData(index);
				}
				break;
			case 'ㅜ':
			case 'n':
				System.out.println("\n다음 정보를 시작합니다.");
				if(index >= count-1) {
					System.out.println("다음 고객정보가 존재하지 않습니다.");
				}else {
				index++;
				printData(index);
				}
				break;
			case 'ㅊ':
			case 'c':
				System.out.println("\n현재 정보 확인을 시작합니다.");
				if(index >= 0 && index < count) {
				printData(index);
				}else {
					System.out.println("현재 고객정보가 존재하지 않습니다.");
				}
				break;
			case 'ㅕ':
			case 'u':
				System.out.println("\n현재 정보를 수정합니다.");
				if(index >= 0 && index < count) {
				updateData(index);
				}else {
					System.out.println("현재 고객정보가 존재하지 않습니다.");
				}
				break;
			case 'ㅇ':
			case 'd':
				System.out.println("\n현재 정보를 삭제합니다.");
				if(index >= 0 && index < count) {
				deleteData(index);				
				}else {
					System.out.println("현재 고객정보가 존재하지 않습니다.");
				}
				break;
			case 'ㅂ':
			case 'q':
				System.out.println("\n프로그램을 종료 합니다.");
				System.exit(0); // 프로그램을 강제 종료하게 만드는 구문
				scan.close();
				break;
			default:
				System.out.println("\n메뉴를 잘못 입력했습니다..");
			}
		}//end while
	}//end main

	
	//고객 정보를 입력받는 메서드 선언
	public static void insertData() {
		
		System.out.println("===========고객 정보 입력==========");
		System.out.printf("이름: ");
		String name = scan.next();
		
		System.out.printf("성별(M/F): ");
		String s = scan.next();
		char gender = s.charAt(0);
		
		System.out.printf("이메일: ");
		String email = scan.next();
		
		System.out.printf("출생년도: ");
		int birth = scan.nextInt();
		System.out.println("=========================");
		
		//index는 -1 이기때문에 nameList[index]로 하면 안됨 ㅋㅋㅋ
		nameList[count] = name; //nameList[0번인덱스] = name 대입
		genderList[count] = gender;
		emailList[count] = email;
		birthList[count] = birth;		
		count++; //위의 과정이 끝나면 count를 1로 올려라
	
	}
	
	//고객 정보를 인덱스에 맞게 출력하는 메서드 선언.
	public static void printData(int index) {
		
		
		System.out.println("======고객 정보======");
		System.out.println("이름: " + nameList[index]);
		System.out.println("성별: " + genderList[index]);
		System.out.println("이메일: " + emailList[index]);
		System.out.println("출생년도: " + birthList[index]);
		System.out.println("=========================");
	}
	
	//고객 정보를 수정하는 메서드 선언..
	public static void updateData(int index) {
		
		System.out.println("=========고객 정보 수정==========");
		System.out.printf("이름(%s): ",nameList[index]);
		nameList[index] = scan.next();
		
		System.out.printf("성별(M/F)(%s): ",genderList[index]);
		genderList[index] = scan.next().charAt(0);
		
		System.out.printf("이메일(%s): ",emailList[index]);
		emailList[index] = scan.next();
		
		System.out.printf("출생년도(%d): ",birthList[index]);
		birthList[index] = scan.nextInt();
		
		
						
		//새로운 정보들을 입력받아 각각의 배열의 수정 인덱스에 있는 데이터를
		//변경시키세요. 수정시에는 수정전의 정보들이 출력되로록 하세요.
		//ex) 이름(홍길동): ----
	}
	public static void deleteData(int index) {
		
		for(int i=index; i<count-1; i++) {
			nameList[i] = nameList[i+1];
			genderList[i] = genderList[i+1];
			emailList[i] = emailList[i+1];
			birthList[i] = birthList[i+1];			
		}
		count--;
	}
	
}//end class

