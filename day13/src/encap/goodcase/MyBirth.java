package encap.goodcase;

public class MyBirth {
	
	
	/*
	 * 은닉(캡슐화)을 사용하려면 데이터 참조를 제한할 멤버변수의
	 * 앞에 private제한다를 붙입니다.
	 */
	
	private int year;
	private int month;
	private int day;
	
	/*
	 - 은직된 멤버변수에 접근하기 위해서는
	 클래스 설계자가 미리 만들어 놓은 setter/getter메서드를 
	 사용하여 데이터에 접근해야 합니다.
	 
	 - setter메서드 선언.
	 1. setter메서드는 은닉변수에 값을 저장시키기 위한 메서드입니다.
	 2. 메서드의 접근제한자를 public으롤 설정하여 이름은 일반적으로
	 set + 멤버변수이름으로 지정합니다.
	 */
	
	
	/*
	 - getter 메서드 선언.
	 1. getter메서드는 은닉변수의 값을 얻어낼 때 사용하는 메서드입니다.
	 2. setter와 마찬가지로 public제한으로 외부에 메서드를 공개하고
	 이름은 일반적으로 get + 멤버변수이름으로 지정합니다.
	 */
	
	public void setYear(int year) {
		if(year < 0 || year > 3000) {  
			System.out.println("잘못된 년도 입니다.");
		}else { 
			this.year = year;
		}		
	}
	
	public int getYear() {
		return this.year;
	}
		
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("잘못된 월 입니다");
		}else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setDay(int day) {
		if (day < 1 || day > 31) { 
			System.out.println("잘못된 일수 입력입니다.");
		}else {
			this.day = day;
		}
	}
	
		public int getDay() {
			return this.day;
		}	
		
	public void info() {
		System.out.printf("%d년도 %d월 %d일 입니다.", getYear(),getMonth(),getDay());
	}
		

}




