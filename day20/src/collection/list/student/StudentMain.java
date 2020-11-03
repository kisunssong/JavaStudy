package collection.list.student;

import java.util.*;

public class StudentMain {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		Student stu = null;		
		for(int i = 0; i < 2; i++) {
			stu = new Student();
//			stu.inputStuInfo();
//			stu.calcTotAvgGrade();
			list.add(i, stu);
			System.out.println(stu);
		}
		
//		Point.showPointUI();
//		
//		for(int i = 0; i < list.size(); i++) {
//			Student n = list.get(i);
//			n.outputStuInfo();
//		}
				
		// 이것도 된다~~이건 쫌 편함.
//		for(Student n : list) { // list의 0번째 인덱스 부터 꺼내서 n으로 전달
//			n.outputStuInfo();
		
		
	}
}
