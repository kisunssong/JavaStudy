class Father05 {
	void fa05() {
		System.out.println("�θ�Ŭ���� �޼��� f05()");
	}
}
class Child05 extends Father05 {
	void ch05() {
		System.out.println("�ڽ�Ŭ���� �޼��� f05()");
	}
}

public class WeekEx05 {
	public static void main(String[] args) {
		
		Father05 fa = new Child05(); //��ĳ����, ��Ӱ��迡�� �ڼ�->����Ÿ�� ��ȯ
		fa.fa05();
//		fa.ch05(); // ��ĳ��������, ���� �޼��� ������
		
		System.out.println("=================");
		Child05 ch = (Child05)fa; // fa�� �ٿ�ĳ���ð���
		//��Ӱ��迡�� �θ�Ÿ���� �ڼ�Ÿ������ �����ϴ� ��
		//�ݵ�� ������ ��ĳ������ �ѰͿ� ���ؼ��� �ٿ�ĳ���� ����!
		//(�ڼ�Ÿ��) ����ȯ(ĳ����) �����ڸ� ��������� ����ؼ� �ٿ�ĳ�����ؾ���
	}
}
