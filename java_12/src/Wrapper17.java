/*
����(Wrapper:  ����) Ŭ����
�ڹ��� �⺻ Ÿ�� (�ڷ���: Data Type) 8���� �����ؼ� Ŭ����ȭ �Ѱ�

���� Ŭ���� ����
�⺻�ڷ��� -> ���� Ŭ������
byte	Byte
char	Character
short	Short
int		Integer
long	Long
float	Float
double	Double
boolean	Boolean
jdk1.5���� ���� �ڽ̰� �����ڽ� ������ �߰���
����ڽ��̶� �ڹ� �⺻Ÿ���� ���� Ŭ���������� �ڵ��� ��ȯ�ϴ� ���� ����
�����ڽ��̶� ����Ŭ�������� �⺻Ÿ������ �ٲ�°��� ����
*/


public class Wrapper17 {
	public static void main(String[] args) {
		
		int n01 = 10;
		int n02;
		Integer num01;
		Integer num02 = new Integer(20);
		num01 = n01; // ���� �ڽ�
		System.out.println("����ڽ̰�: "+num01);
		n02 = num02;
		System.out.println("�����ڽ�: "+n02);
	}
}
