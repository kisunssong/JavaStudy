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
		System.out.println("# �������� �Է��� �����մϴ�. ");
		System.out.printf("- �й�: ");
		this.stuId = sc.next();
		System.out.printf("- �̸�: ");
		this.name = sc.next();
		
// �л��� ������ �Է¹޴� �޼���.		
		while(true) {
			try {
				System.out.print("- ����: ");
				this.kor = sc.nextInt();
				System.out.print("- ����: ");
				this.eng = sc.nextInt();
				System.out.print("- ����: ");
				this.math = sc.nextInt();
				break;
			}catch(Exception e) {
				System.out.println("������ ���ڷθ� �Է��ϼ���.");
// nextInt()�� �ڵ����� ���͸� �Է��ϱ� ������ �Է�â�� �����ϱ� ����.
				sc.nextLine(); 
			}
		}
	}
	
// ����, ���, ������ ����� �޼���.
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

// �л��� ���������� ����ϴ� �޼���.
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
