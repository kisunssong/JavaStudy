//���״��׽�

public class ThreeExample {
	
	public static void main(String[] args) {
		//���ǽ� ? true�� �� �� : false�� �� ��
		// - Math.random() - 0.00 ~ 0.99... ������ ���� ����
		int ran = (int)(Math.random() * 10+1);
		//ran ���� Ÿ�� , �������� �� ���� %2 ���ؼ� 0�� �Ǹ� "¦��"(true) : "Ȧ��"(false);
		String word = ran%2 == 0 ? "¦��" : "Ȧ��";
		System.out.printf("�Է��Ͻ� ���ڴ� %d, �̼��� %s�Դϴ�.",ran,word);
	}
}


//	public static void main(String[] args) {
//		Scanner a = new Scanner(System.in);
//		System.out.println("�̸��� �Է��ϼ���: ");
//		String c = a.nextLine();
//		System.out.printf("�Է��Ͻ� �̸��� : %s", c);
//		System.out.println();
//		String[] name = {"aaa","bbb","ccc","ddd"};
//		name [0] ="aaa";
//		name [1] ="bbb";
//		name [2] ="ccc";
//		name [3] ="ddd";
//		for (int search = 0; search < name.length; search++) {
//			String name1 = name[search];
//			System.out.println(c);
//		}

//		if ( ) {
//			System.out.printf("%s���� ��ȣ�� : %s�Դϴ�.", c, name[0]);
//		}else if ( c == name[1] ) {
//			System.out.printf("%s���� ��ȣ�� : %s�Դϴ�.", c, name[1]);
//		}else if ( c == name[2] ) {
//			System.out.printf("%s���� ��ȣ�� : %s�Դϴ�.", c, name[2]);
//		}else if ( c == name[3] ) {
//			System.out.printf("%s���� ��ȣ�� : %s�Դϴ�.", c, name[3]);
//			System.out.println();
//		}else {
//			System.out.printf("%s���� ���⿡ �����ϴ�.", c);
//		}
//		
//		a.close();	
//		}
//	}

