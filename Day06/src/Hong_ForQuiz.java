import java.util.Scanner;

public class Hong_ForQuiz {
	
	public static void main(String[] args) {
		
		// 0.0 - 1.0(0.99���)*8.. 0 - 7���� + 2, 9����
//		int num = (int)(Math.random() * 8)+2;
		Scanner sc = new Scanner(System.in);
		System.out.printf("�ܼ�: ");
		int num = sc.nextInt();
		System.out.println("������ " + num + "��");
		System.out.println("--------------------");
		
		for (int i=1; i<10; i++) {
			System.out.println(num + " x " + i + " = " + num*i );
//			}
		}
		sc.close();
	}	

}
