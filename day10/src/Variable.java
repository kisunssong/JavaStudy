
public class Variable {
	
	//�ʵ� (�������) ����.
	int a; //�ʱ�ȭ���� ������ �⺻������ �ڵ� �ʱ�ȭ
	
	//�޼��� ����.
	void printNumber(int c) {
		//�������� b�� �Ű����� c�� ����.
		int b = 1; //���������� �ݵ�� ���� �ʱ�ȭ�ؾ� �մϴ�.
		
		System.out.println("�������: " + a);
		System.out.println("��������: " + b);
		System.out.println("�Ű�����: " + c);
	}
	
	public static void main(String[] args) {
		
		Variable v = new Variable();
		v.printNumber(5);
	}
}
