package api.util.date;

// 날짜 표현
import java.util.Date;

// 날짜의 표현형식을 바꿔주는 라이브러리입니다.
import java.text.SimpleDateFormat;

public class DateExample {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat(""
				+ "yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));
		
//19-02-11 오전 10:50:23
//오늘은 월요일입니다. 오늘은 1년 중 42번째 날입니다.
		
		sdf = new SimpleDateFormat(""
				+ "yy-MM-d a H:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat(""
				+ "오늘은 E요일입니다. 오늘은 1년 중 D번째 날입니다.");
		System.out.println(sdf.format(date));
				
		
	}
}
