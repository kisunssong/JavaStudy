class Document {
	
	static int count=0;//��������
	String name;//�ν��Ͻ�����
	
//	Document() {
//		this("�������"+ ++count);//���� Ŭ�������� �ٸ� ������ ȣ��
//	}
//	Document(String name) {
//		this.name=name;
//		System.out.println("����"+ this.name+"�� ������.");
//	}
	
	 Document() {
	 this("no title " + ++count);
	 }
	 Document(String name) {
	 count++;
	 this.name = name;
	 System.out.println("doc" + " \"" + this.name +" " + count + "\"" + "is made.");
	 }
	
}


public class Static08 {
	
	public static void main(String[] args) {
		
		new Document(); // �⺻ ������ ȣ��
		new Document("�ڹ�.txt"); //�����ε� �� ������ ȣ��
		new Document(); 
	}
}
