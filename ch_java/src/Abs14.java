/*
������̶�?
1. final�� ����� ������ ����� �Ѵ�. ����� ������ �� ���� ������ ���Ѵ�.
2. ������� ���������� ���빮�ڷ� �Ѵ�.
3. ������� ����� ���ÿ� �ݵ�� �ʱ�ȭ ������ ���ľ� �Ѵ�.
*/
class FinalClass {
	final int NUM=10;
	
	void setNum(int num) {
		NUM = num; //����� �����ҷ��ٰ� ������ �߻�
	}
}

public class Abs14 {
	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		fc.setNum(100);
		System.out.println(fc.NUM);
	}
}
