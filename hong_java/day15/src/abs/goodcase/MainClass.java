package abs.goodcase;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 *�߻� Ŭ������ ������ ��ü�� ������ �� �����ϴ�.
		 *�ݵ�� ����� ���� Ŭ������ ��üȭ���Ѿ� �մϴ�. 
		 */
		
//		HeadStore h = new HeadStore(); // ��ü������ �ȵ�.
		HeadStore s = new Store(); // �ڽ�Ŭ������ ���� ��ü�� �����.
		s.orderApple();
		s.orderwaterMelon();
		s.orderPeach();
	}

}
