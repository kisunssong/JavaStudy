
public class Hong_IfExample1 {
	public static void main(String[] args ) {
		
		//0 ~ 100������ ������ ������ �߻�.
		int point = (int)(Math.random() * 101);
		System.out.println("����: " + point);
		
		//���� ������ point�� 60�̻��̰ų� ������ �Ʒ� print���� ��µ�
		if(point >= 60) {
			System.out.println("���迡 �հ��߽��ϴ�.");
			System.out.println("60�� �̻� �Դϴ�.");
		} else	{
			System.out.println("60�� �̸� �Դϴ�.");
			System.out.println("���迡 ���հ��ϼ̽��ϴ�.");
		}
		System.out.println("�����ϼ̽��ϴ�.");
		
	}//end main

}//end class
