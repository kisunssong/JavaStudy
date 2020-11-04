package collection.list.student;

import java.util.*;

public class StudentMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
	
		while(true) {
			Point.menuInfo();
			System.out.printf("메뉴를 입력하세요: ");
			char c = sc.nextLine().charAt(0);
			switch(c) {
				case '1':
					Point.inputPoints(list);
					break;
				case '2':
					Point.showAllPoints(list);
					break;
				case '3':
					Point.searchPoints(list);
					break;				
				case '4':
					Point.modifyPoints(list);
					break;
				case '5':
					Point.deletePoint(list);
			}
		}
		
	}
}
