
public class Static07 {
	
	static int count = 0; // ����� �� ��ǰ����� �����ϱ� ���� ��������
	int serialNo; // 0�ʱⰪ, �� ����� ��ǰ�� ������ �ø��� ��ǰ��ȣ
	
	{
		++count; //�� ��ǰ����� ī����
		serialNo = count;
	}// �ν��Ͻ� ���� �ʱ�ȭ���: ��ǰ�� ����ɶ� ���� ����
		
	public static void main(String[] args) {
		
		Static07 s1 = new Static07(); //�⺻������ ȣ���,���� �ν��Ͻ� �ʱ�ȭ��� ����
		Static07 s2 = new Static07();
		Static07 s3 = new Static07();
		
		System.out.println("s01 ��ǰ �ø��� ��ȣ: "+s1.serialNo);
		System.out.println("s01 ��ǰ �ø��� ��ȣ: "+s2.serialNo);
		System.out.println("s01 ��ǰ �ø��� ��ȣ: "+s3.serialNo);
		System.out.println("��ü ����� ����: "+Static07.count);
		
/*
���������� ����ϴ� ������ ���굵�� ��� ��ǰ�� ���ؼ� �����ϰ��� �ϴ� ���� �ִ°��
����Ѵ�. ��ǥ������ �� ��ǰ ������
*/

	}	
}
/*
s01 ��ǰ �ø��� ��ȣ: 1
s01 ��ǰ �ø��� ��ȣ: 2
s01 ��ǰ �ø��� ��ȣ: 3
��ü ����� ����: 3
*/
