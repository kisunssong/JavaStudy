class Member07 {
	private String id;
	private String name;
	
/*
���� Ŭ���� �Ҽ��� �ν��Ͻ� ������ ������ ������ �Ҽ��� �Ű��������� ������
���� �ν��Ͻ� ������ �տ� this. �� �ٿ��� ���еǾ� ���� ���� �����.
this�� �� �ڽ� Ŭ�������� ����� ������� �� �ν��Ͻ� ������ ����Ű�� ����
���� Ű����(�����)�̴�.	
*/
	public Member07() {}
	public Member07(String id, String name) {
		this.id=id; this.name=name;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void print() {
		System.out.println("���̵�: "+id+", �̸�: "+name);
	}
}


public class Cons07 {
	public static void main(String[] args) {
		
		Member07 create1=new Member07("aaaa","ȫ�浿");
		create1.print();
		create1.setId("abcd");
		create1.setName("�̼���");
		create1.print();
	}
}
