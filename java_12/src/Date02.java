class Card extends Object {
	String kind;//ī������
	int number;//ī���ȣ
	
	Card() {
		this("SPADE",1);//���� Ŭ�������� �ٸ������ڸ� ȣ��
	}
	Card(String kind, int number) {
		this.kind = kind; 
		this.number = number;
	}
	
	public String toString() {
		return "ī������: "+kind+", ī���ȣ: "+number;
	}
	
}


public class Date02 {
	public static void main(String[] args) {
		Card c = new Card();
		System.out.println(c);
		Card c1 = new Card("�Ｚī��",33);
		System.out.println(c1);
	}
}
