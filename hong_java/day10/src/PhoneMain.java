
public class PhoneMain {

	public static void main(String[] args) {
		
		//�����ڴ� ��ü�� ������ �� 1ȸ ȣ���� �� �ֽ��ϴ�.
		Phone basic = new Phone();
		basic.info();

			
		Phone bluePhone = new Phone("�����̾�");
		bluePhone.info();
		
		Phone galaxyS9 = new Phone("�ڹ�Ʈ���", "������S9");
		galaxyS9.info();
		
		//3������ ��������� �ʱ�ȭ�ϴ� �����ڸ� �����Ͻð�
		//main�޼��� ���ο��� �ش� ��ü�� �����
		//info�� ����ϼ���. ��ü ���� �̸��� shaomi
		
		Phone shaomi = new Phone("���","������",1000000);
		shaomi.info();
	}

}
