package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	public static void main(String[] args) {
		
		/* <�ζ� ��ȣ ����ϱ�>
		 * 1. �ζ� ��ȣ 6���� ���� �迭�� �����ϼ���.
		 * 2. ���� 1~45 ������ ������ 6�� �߻����� �迭�� ��������.
		 * 3. Arrays.sort(�迭�̸�) �޼��带 ����Ͽ�
		 * �翭�� ������������ �����ϼ���.
		 */
		
		Random ran = new Random();
		int[] lotto = new int[6];
		int[] mylotto = new int[6];
		int index = 0;
		int i = 0;

		while(true) {			
			
			int random = ran.nextInt(45) + 1;
			for(i = 0; i < index; i++) {
				if(lotto[i] == random) {
					break;
				}
			}
			if(i == index) {
				lotto[index++] = random;
			}
			if(index == 6) {
				break;			
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));		
	}
}

