import java.util.Scanner;

public class Hong_BreakExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		while(true) {
			System.out.println("--------------");
			System.out.println("15 x 6 = ??");
			System.out.print("> ");

			int answer = sc.nextInt();

			if(answer == 90) {
				System.out.println("�����Դϴ�.!!");
				break;
			}else {
				System.out.println("�����Դϴ�.!!");
			}
		}
		sc.close();
	}
}
