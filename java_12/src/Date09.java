
import java.util.Random;
public class Date09 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Random rand2 = new Random();
		//RandomŬ������ ������ �� ������ ���� �� �ִ�
		//�ӽú�� ���� ���� ���� �� ���
		
		for(int i=0; i<5; i++) {
			System.out.println(i+" : "+rand.nextInt());
			//intŸ�� ������ ���� �߻�
		}
		System.out.println("============");
		
		System.out.println("�ι�° ���� �߻�: ");
		for(int i=1; i<=5; i++) {
			System.out.println(i+" = "+rand2.nextInt());
			//intŸ�� ������ ���� �߻�
		}
	}
}
