class Father07 {
	void f07() {
		System.out.println("����Ŭ���� �޼��� f07()");
	}
}
class Child07 extends Father07 {
	void f07() {
		System.out.println("�������̵� �ڽ� �޼��� f07()");
	}
}

public class WeekEx07 {
	public static void main(String[] args) {
		Father07 f = new Father07();
		f.f07();
		
		Father07 f2 = new Child07();
		//��ĳ���� �Ŀ� ������ �޼���� ȣ��Ұ�!
		//�� �������̵��� �ߴٸ� �ҷ��ü��մ�!
		f2.f07();
	}
}
