package abs.goodcase;

public class Store extends HeadStore{
	
	public Store() {
		super();
	}
	
	
	// absract �� �ִ� �޼���� ������ �������̵��ؿ;� �Ѵ�.
	public void orderBanana() {
		System.out.println("�ٳ��� �꽺�� ������ 2800���Դϴ�.");
	}
	public void orderMelon() {
		System.out.println("��� �꽺�� ������ 4800���Դϴ�.");
	}
	public void orderApple() {
		System.out.println("��� �꽺�� ������ 3000���Դϴ�.");
	}
	public void orderGrape() {
		System.out.println("���� �꽺�� ������ 3500���Դϴ�.");
	}
	
	public void orderwaterMelon() { // �Ϲݸ޼���� �������̵� �� ���氡��
		System.out.println("���� �꽺�� ������ 4500���Դϴ�.");
	}
//	public void orderPeach() { // final������ �� ���� �Ұ�
//		System.out.println("���� �꽺�� ������ 4500���Դϴ�.");
//	}
	
}
