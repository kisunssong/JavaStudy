
public class Hong_EnhancedForLoop {
	
	public static void main(String[] args) {
		
		String[] weekDay = {"��","��","ȭ","��","��","��","��"};
		
//		for(int i=0; i<weekDay.length; i++) {
//			System.out.println(weekDay[i]);
		
		for (String chose : weekDay) { //0�ε��� ����, �Ʒ� ���, 1���ε���---
			System.out.println(chose + "����");			
		}
		System.out.println("---------------------");
		
		int[] scores = {98,71,85,67,100,96};
		
		//���� for���� ����Ͽ� ������ ����� ����ϼ���.
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.printf("�� ������ : "+sum+"�Դϴ�.");
		
		System.out.println("---------------------");
		
		//�Ҽ������� ǥ��
		//%8 ĭ ���� .2 �Ҽ���2�ڸ����� ǥ�� f�Ǽ�
		double age = (double)sum;
		System.out.printf("�����:%8.2f ",age/scores.length);
		
	}	
}

