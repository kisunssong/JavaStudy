package collection.list.student;

import java.util.*;

public class Point extends Student{
	static final String Name = "ㅎㅎ";
	final String  abc = "ㅎㅎ";
	static double totavg;
	static int a = 2;
	public static Scanner sc = new Scanner(System.in);
	
	public static void showPointUI() {
		System.out.println("               *** 성적표 ***");
		System.out.println("================================================");
		System.out.println("학번        이름     국어     영어      수학   총점     평균        학점");
		System.out.println("================================================");
	}
	
	// 학생의 성적정보를 입력할 메서드
	// 1.학생의 객체를 1개 생성
	// 2.학생의 객체에 속성값을 설정하는 메서드들을 호출
	// 3.정보저장이 완료된 객체를 리스트에 추가
	// 4.저장완료 메세지를 출력
	public static void inputPoints(List<Student> students) {
		Student stu = new Student();			
		stu.inputStuInfo();
		stu.calcTotAvgGrade();
		students.add(stu);
		System.out.println(stu.getName() + "님 저장이 완료되었습니다.");
		totavg += stu.getTot();
		}	

	// 전체 학생들의 성적정보를 출력할 메서드
	// 리스트 안에 들어있는 학생객체들의 정보를 반복문을 통해 전체 출력
	// 우리반의 전체평균을 가장 아랫부분에 출력
	public static void showAllPoints(List<Student> students) {
		showPointUI();
		for(int i = 0; i < students.size(); i++) {
			Student n = students.get(i);
				n.outputStuInfo();
			
		}
		System.out.printf("우리반 전체 평균은 %.2f 점 입니다.",totavg/students.size());
	}
	// 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 정보만 출력
	// 찾는 학번이 없을시 검색하지 못했다는 메세지를 출력
	public static void searchPoints(List<Student> students) {
		System.out.printf("학번을 입력하세요: ");
		String search = sc.nextLine();
		boolean check = false;
		for(int i = 0; i < students.size(); i++) {
			Student n = students.get(i);				
			if(n.getStuId().equals(search)) {
				Point.showPointUI();
				n.outputStuInfo();
				check = false;
				break;
				
			}
			check = true;
		}
		if(check) {
			System.out.println(search + " 학번 은 없습니다.");
		}
	}
	
	// 학생의 성적정보를 수정할 메서드.
	public static void modifyPoints(List<Student> students) {
		System.out.printf("수정할 학번을 입력하세요: ");
		String search = sc.nextLine();
		
		for(int i = 0; i < students.size(); i++) {
			Student num = students.get(i);
			if(num.getStuId().equals(search)) {
				System.out.println("[1]학번, [2]이름, [3]국어점수, [4]영어점수, [5]과학점수, [6]취소");
				System.out.printf("수정할 번호를 입력해주세요: ");				
				char c = sc.nextLine().charAt(0);
				switch(c) {
					case '1':
						while(true) {
						System.out.println("학번 수정을 시작합니다.");
						System.out.println("기존 학번: " + num.getStuId());
						System.out.printf("수정 할 학번: ");
						try {
						String n = sc.nextLine();
						int a = Integer.parseInt(n);
						num.setStuId(n);					
						System.out.println(num.getStuId()+" 학번으로 변경 되었습니다.");
						Point.showPointUI();
						num.outputStuInfo();
						}catch (Exception e) {
							System.out.println("입력은 숫자로만 해주세요");
							sc.nextLine();
						}
						break;
						}
						break;
					case '2':
						while(true) {
						try {
						boolean check = false;
						System.out.println("이름 수정을 시작합니다.");
						System.out.println("기존 이름: " + num.getName());
						System.out.printf("수정 할 이름: ");
						Scanner scan = new Scanner(System.in);
						String search1 = scan.nextLine();
						num.setName(search1);
						int b = Integer.parseInt(search1);
						check = true;
							if(check) { 
								System.out.println("문자 로만 입력해주세요.");				
							}		
							}catch (Exception e){				
								System.out.println(num.getName() + "이름으로 변경 되었습니다.");
								Point.showPointUI();
								num.outputStuInfo();
							}
							break;
						}
						break;
					case '3':
						while(true) {
						try {
						System.out.println("국어 점수 수정을 시작합니다.");
						System.out.println("기존 국어 점수: " + num.getKor());
						System.out.printf("수정 할 국어 점수: ");
						num.setKor(sc.nextInt());
						System.out.println(num.getKor() + "점수로 변경 되었습니다.");
						num.calcTotAvgGrade();
						Point.showPointUI();
						num.outputStuInfo();						
							}catch (Exception e) {
								System.out.println("입력은 숫자로만 해주세요");
							}
							break;
						}
						break;
					case '4':
						while(true) {
							try {
						System.out.println("영어 점수 수정을 시작합니다.");
						System.out.println("기존 영어 점수: " + num.getEng());
						System.out.printf("수정 할 영어 점수: ");
						num.setEng(sc.nextInt());
						System.out.println(num.getEng() + "점수로 변경 되었습니다.");
						num.calcTotAvgGrade();
						num.outputStuInfo();
						Point.showPointUI();
							}catch (Exception e) {
								System.out.println("입력은 숫자로만 해주세요");
							}
							break;
						}
						break;
					case '5':
						while(true) {
							try {
						System.out.println("과학 점수 수정을 시작합니다.");
						System.out.println("기존 과학 점수: " + num.getMath());
						System.out.printf("수정 할 과학 점수: ");
						num.setMath(sc.nextInt());
						System.out.println(num.getMath() + "점수로 변경 되었습니다.");
						num.calcTotAvgGrade();
						Point.showPointUI();
						num.outputStuInfo();				
							}catch (Exception e) {
								System.out.println("입력은 숫자로만 해주세요");
							}
							break;
						}
						break;	
					default:
						System.out.println("성정 정보를 취소합니다.");
				}					
			}
		}	
	}
	public static void deletePoint(List<Student> students) {
		System.out.printf("삭제할 학번을 입력하세요: ");
		String del = sc.nextLine();
		boolean check = false;
		for(int i = 0; i < students.size(); i++) {
			Student n = students.get(i);
			if(n.getStuId().equals(del)) {
				System.out.println(n.getName() + " 님의 성적을 삭제하시겠습니까?[Y/N]");
				System.out.printf("=> ");
				String choose = sc.nextLine();
				choose.toLowerCase();
				char c = choose.charAt(0);
				if(c == 'Y') {
					students.remove(n);
					totavg -= n.getTot();
					System.out.println(n.getName() + " 님을 삭제 하였습니다.");
					check = false;
					break;
				}else if(c == 'N') {
					System.out.println("삭제를 취소합니다.");
					check = false;
					break;
				}				
			}
			check = true;			
		}
		if(check) {
			System.out.println(del + " 학번 학생은 없습니다.");
		}
		
	}
	// 프로그램 메뉴정보를 보여줄 메서드.
	public static void menuInfo() {
		System.out.println("\n*** 성적관리 프로그램 ***");
		System.out.println("1. 성적정보 입력");
		System.out.println("2. 전체성적 조회");
		System.out.println("3. 개별성적 조회");
		System.out.println("4. 성적정보 수정");
		System.out.println("5. 성적정보 삭제");
		System.out.println("6. 프로그램 종료");
		System.out.println("********************");
	}
}
