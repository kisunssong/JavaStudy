package exception.throws_;

public class ThrowsExample2 {
	
	public void aaa(int n) throws Exception {
		System.out.println("aaa ȣ��!");
		int i = 10 / n;
		System.out.println("�����: " + i);
		System.out.println("aaa���� ����!");
	}	
	public void bbb() {
		System.out.println("bbb ȣ��");
		try {
			aaa(1);
		} catch (Exception e) {
			System.out.println("0�� �Է��Ͻø� �ȵ˴ϴ�.");
		}
		System.out.println("bbb���� ����");
	}	
	public void ccc() {
		System.out.println("ccc ȣ��");
		bbb();
		System.out.println("ccc���� ����");
	}
	public ThrowsExample2() {
		System.out.println("������ ȣ��");
		ccc();
		System.out.println("������ ���� ����");
	}
	
	public static void main(String[] args) {				
		ThrowsExample2 te = new ThrowsExample2();
	}
	
}