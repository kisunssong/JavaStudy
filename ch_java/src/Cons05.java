class Member05 {
	private String id;
	private String name;
	
	public Member05(String new_id, String new_name) {
		id=new_id; name=new_name;
	}
	
	public void pr() {
		System.out.println("id: "+id+", �̸�: "+name);
	}
}

public class Cons05 {
	public static void main(String[] args) {
		
		Member05 create1=new Member05("sin123", "�̼���");
		create1.pr();
		
//		Member05 create1=new Member05();
		//������ �����ε� �Ǹ� �⺻�����ڸ� ���̻� ���������� ���������ʱ⶧����
		//������ ������ ����. ��������� �⺻�����ڸ� ����������.
	}
}
