
public class Hong_BreakExample4 {
	
	public static void main(String[] args) {
		
		//'A'�� �����ڵ� ����:65
		//'B'�� �����ڵ� ����:66
		//'A' ~ 'Z'���� ����
		
		/*
		 * ���� �ݺ������� break�� ����Ͽ� �ٱ��� �ݺ�������
		 * �ѹ��� Ż���Ű���� �ܺ� �ݺ����� label�� ���Դϴ�.
		 */
		
		u_case: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				//lower f������ �����
				//u_case�� ���̸� �ѹ濡 ����for������ Ż���
				if(lower == 'f') break u_case;
			}
			
		}
	}

}
