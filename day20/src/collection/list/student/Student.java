package collection.list.student;

import java.util.*;

public class Student {
	
	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	
	private Scanner sc = new Scanner(System.in);
	
	public void inputStuInfo() {
		System.out.println("# 성적정보 입력을 시작합니다. ");
		System.out.printf("- 학번: ");
		this.stuId = sc.next();
		System.out.printf("- 이름: ");
		this.name = sc.next();
		
// 학생의 정보를 입력받는 메서드.		
		while(true) {
			try {
				System.out.print("- 국어: ");
				this.kor = sc.nextInt();
				System.out.print("- 영어: ");
				this.eng = sc.nextInt();
				System.out.print("- 수학: ");
				this.math = sc.nextInt();
				break;
			}catch(Exception e) {
				System.out.println("점수는 숫자로만 입력하세요.");
// nextInt()는 자동으로 엔터를 입력하기 때문에 입력창을 고정하기 위함.
				sc.nextLine(); 
			}
		}
	}
	
// 총점, 평균, 학점을 계산할 메서드.
	public void calcTotAvgGrade() {
		this.tot = this.kor + this.eng + this.math;
		this.avg = this.tot / 3.0;
		
		if(avg >= 90) {
			this.grade = 'A';
		}else if(avg >= 80) {
			this.grade = 'B';			
		}else if(avg >= 70) {
			this.grade = 'C';			
		}else if(avg >= 60) {
			this.grade = 'D';			
		}else {
			this.grade = 'F';
		}
	}

// 학생의 성적정보를 출력하는 메서드.
	public void outputStuInfo() {
		System.out.printf("%4s  %3s  %3d  %3d  %3d  %3d  %3.2f  %c\n",
				this.stuId, this.name, this.kor, this.eng, this.math,
				this.tot, this.avg, this.grade);
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	
}
