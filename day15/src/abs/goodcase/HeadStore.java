package abs.goodcase;

public abstract class HeadStore {
	
	/*
	 * 1. �޼��忡 abstract�� ���̸� �ش� �޼���� �߻� �޼��尡 �Ǹ�
	 * �� �޼���� ����� ���� �ڽ� Ŭ�������� �ݵ�� �������̵��� �ؾ�
	 * �մϴ�. �׷�ġ ������ ������ �߻��մϴ�.
	 * 2. �߻� �޼���� ��ü�� �������� �ʴ� �޼����� Ʋ ������ �ϱ� ������
	 * �޼����� �ٵ�κ� ({})�� ���� �����ݷ����� �޼��� ������ �����մϴ�.
	 * 3. �Ϲ� Ŭ���������� �߻� �޼��带 ���� �� �� �����ϴ�. �߻� �޼��尡
	 * �ϳ��� �����ϴ� Ŭ������ �ݵ�� �߻� Ŭ������ �Ǿ�� �մϴ�.
	 * 4. �߻� Ŭ���� ���ο����� �߻� �޼��常�� ������ �ʿ�� �����ϴ�.
	 * �Ϲ� �޼��嵵 ��� ������ �� �ֽ��ϴ�. 
	 */
	public HeadStore() {
		System.out.println("HeadStore�� ������ ȣ��!");
	}
	
	public abstract void orderApple(); //�߻�޼��常 �����ݷ� �� 
	public abstract void orderBanana(); //�߻�޼��常 �����ݷ� �� 
	public abstract void orderGrape(); //�߻�޼��常 �����ݷ� �� 
	public abstract void orderMelon(); //�߻�޼��常 �����ݷ� �� 
	
	public void orderwaterMelon() {
		System.out.println("���� �꽺�� ������ 4000�� �Դϴ�.");
	}
	public final void orderPeach() {
		System.out.println("������ �꽺�� ������ 2000�� �Դϴ�.");
	}

}
