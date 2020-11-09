
import java.util.Calendar;

public class Enum15 {
	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("int타입,이번년도 숫자반환=>YEAR: "+year);
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println("int타입,이번달 숫자반환=>MONTH+1: "+month);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("int타입,오늘 일자 숫자반환=>DAY_OF_MONTH: "+day);
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("int타입,오늘 요일 숫자반환=>DAY_OF_WEEK: "+week);
		
		String strWeek = null;
		
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
			case Calendar.SUNDAY:
				strWeek = "일";
				break;
		}
		System.out.println(year+"년"+month+"월"+day+"일"+strWeek+"요일");		
	}
}
/*
int타입,이번년도 숫자반환=>YEAR: 2020
int타입,이번달 숫자반환=>MONTH+1: 11
int타입,오늘 일자 숫자반환=>DAY_OF_MONTH: 6
int타입,오늘 요일 숫자반환=>DAY_OF_WEEK: 6
2020년11월6일금요일
*/