
public class PenMain {

	public static void main(String[] args) {
		
		//Pen�� ��ɰ� �Ӽ��� ����Ϸ���
		//����� Ŭ������ �ε����� Pen��ü�� �����ؾ� �մϴ�.
		Pen blackPen = new Pen();
		
		//��ü�� ��ɰ� �Ӽ��� ����ϱ� ���ؼ���
		//���� ������(.)�� ����մϴ�.
		blackPen.color = "����";
		blackPen.price = 500;
		
		blackPen.write();
		blackPen.info();
		
		Pen redPen = new Pen();
		redPen.color = "����";
		redPen.price = 600;
		
		redPen.write();
		
		System.out.println(redPen);
		System.out.println(blackPen);
		
		//bluePen��ü�� �����Ͽ� write()�� ȣ���Ͽ�
		//"�Ķ��� ���� ���ϴ�."�� ����ϼ���.
		
		Pen bluePen = new Pen();
		bluePen.color = "�Ķ�";
		bluePen.price = 1000;
		
		bluePen.write();
		
		

	}

}
