package api.util.date;

// ��¥ ǥ��
import java.util.Date;

// ��¥�� ǥ�������� �ٲ��ִ� ���̺귯���Դϴ�.
import java.text.SimpleDateFormat;

public class DateExample {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat(""
				+ "yyyy�� MM�� dd�� HH�� mm�� ss��");
		System.out.println(sdf.format(date));
		
//19-02-11 ���� 10:50:23
//������ �������Դϴ�. ������ 1�� �� 42��° ���Դϴ�.
		
		sdf = new SimpleDateFormat(""
				+ "yy-MM-d a H:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat(""
				+ "������ E�����Դϴ�. ������ 1�� �� D��° ���Դϴ�.");
		System.out.println(sdf.format(date));
				
		
	}
}
