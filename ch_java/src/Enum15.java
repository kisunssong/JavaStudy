
import java.util.Calendar;

public class Enum15 {
	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("intŸ��,�̹��⵵ ���ڹ�ȯ=>YEAR: "+year);
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println("intŸ��,�̹��� ���ڹ�ȯ=>MONTH+1: "+month);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("intŸ��,���� ���� ���ڹ�ȯ=>DAY_OF_MONTH: "+day);
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("intŸ��,���� ���� ���ڹ�ȯ=>DAY_OF_WEEK: "+week);
		
		String strWeek = null;
		
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "��";
				break;
			case Calendar.TUESDAY:
				strWeek = "ȭ";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "��";
				break;
			case Calendar.THURSDAY:
				strWeek = "��";
				break;
			case Calendar.FRIDAY:
				strWeek = "��";
				break;
			case Calendar.SATURDAY:
				strWeek = "��";
				break;
			case Calendar.SUNDAY:
				strWeek = "��";
				break;
		}
		System.out.println(year+"��"+month+"��"+day+"��"+strWeek+"����");		
	}
}
/*
intŸ��,�̹��⵵ ���ڹ�ȯ=>YEAR: 2020
intŸ��,�̹��� ���ڹ�ȯ=>MONTH+1: 11
intŸ��,���� ���� ���ڹ�ȯ=>DAY_OF_MONTH: 6
intŸ��,���� ���� ���ڹ�ȯ=>DAY_OF_WEEK: 6
2020��11��6�ϱݿ���
*/