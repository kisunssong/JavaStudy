
public class Hong_SwitchExample2 {
	public static void main(String[] args) {
		
		String[] foods = {"�����", "��ù�", "�ϰ����", "ī��", "�c���"};
		
		//index������ ���� �߻���Ű��
		//foods��  5���� ���ڿ��� ����.
		//idx�� ���� ���� 5�� �༭,, 0 - 4 ���� �������� ����
		//�� foods�� �ε��� 0,1,2,3,4 �� idx���� �ҷ��´�
		int idx = (int)(Math.random() * 5);
		System.out.println("���õ� ����: " + foods[idx]);
		
		switch(foods[idx]) { //foods��[idx]<<��ȣ�� case�� ���� ��ġ�ϸ� ���
		
		case "�����":
			System.out.println("�ѽ��Դϴ�.");
			break;
		case "��ù�":
			System.out.println("�Ͻ��Դϴ�.");
			break;
		case "�ϰ����":
			System.out.println("�߽��Դϴ�.");
			break;
		case "ī��":
			System.out.println("���ִ� �丮 �Դϴ�.");
			break;
		default:
			System.out.println("��Ÿ ���� �Դϴ�.");

		}
		
	}

}
