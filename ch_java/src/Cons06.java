class Member06 {
	private String id;
	private String name;
	
	public Member06() {}
	
	public Member06(String new_id, String new_name) {
		id=new_id; name=new_name;
	}
	public void setYear(int year) {
		
	}
	public void setId(String id) {
		id=id;//���� Ŭ���� �Ҽ��� ��������� �ν��Ͻ����� id�� ������ �޼���
		//�Ҽ��� �Ű�����(��������)���� �������� ������� �ν��Ͻ������̰�, 
		//�Ű��������� �ڹ� �����Ϸ��� ���и��ؼ� �����ʿ��� �������� ����ȵ�
	}
	public void setName(String new_name) {
		name=new_name;
	}
	public void print() {
		System.out.println("ȸ�� ���̵�: "+id+", ȸ���̸�: "+name);
	}
	
}


public class Cons06 {
	public static void main(String[] args) {
		Member06 m=new Member06("aaaaa", "�̼���");
		m.print();
		m.setId("cccc");
		m.print();
		m.setName("ȫ�浿");
		m.print();
		
	}
}
