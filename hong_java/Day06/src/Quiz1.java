import java.util.Arrays;

/* 1.
 * �Ҽ�(PrimeNumber)���ϱ�
 * �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� �� �Դϴ�. 
 * ���ǹ��� �ݺ����� ����� 100������ �Ҽ��� ����� ������.
 * ��Ʈ (for���� for��)
 */

public class Quiz1 {

	public static void main(String[] args) {
		//������ 1�� ������ �� ������ 0�� 2���� ���´�
		for(int i=1; i<6; i++) { // 6���� ������.
			int a = 0; // ���� for���� ���� �ʱ�ȭ�� �ȴ�.
			for(int j=1; j<=i; j++) { //i�� �°� �Ȱ��� 1���� ~ ����
				if(i%j==0) { // i������j ������ 0 ���� ���Ǹ���
					a++; // if���� true�� a�� +1
				}
			}
			if(a == 2) // 2��° for���� �ٵ���, a�� 2�� ������ �ؿ� i(����)���
				System.out.printf(i + " ");
		}
		System.out.println();


		/*
		 * 2.
		 * �ζ� ��ȣ �����ϱ�
		 * �տ��� ��� ���� �߻��� �ݺ���, 
		 * ���ǹ��� ���� �ߺ��Ǵ� ��ȣ���� 1~45 ������ ���� �� 6���� ���ڸ� 
		 * ���������ϰ� �ֿܼ� ����غ�����.
		 * ��Ʈ(while�� ���� for��
		 */		
		//		int ran1 = (int)(Math.random()* 45+1);
		//		int ran2 = (int)(Math.random()* 45+1);
		//		int[] ran = new int[45];
		//		System.out.println(ran.length);
		//		for(int i=0; i<=ran.length; i++) {
		//		
		//		System.out.println();


		//lotto���� 6�� �迭 ����
		int[] lotto = new int[6];
		//0������ üũ�ϱ����� ���� ���� ����
		int index = 0; 
		while(true) {
			int ran = (int)(Math.random()*45+1);
			//i�� ����üũ�� ���� ��������, for���� ���� 0���� �ʱ�ȭ��
			int i=0; 
			//�ѹ���° 0<1 true�� ���´�. 
			//ran == lotto[0]�ε��� üũ �� i +1 �Ѵ�.
			for(i=0; i<index; i++) { 
				if(ran==lotto[i]) {
					//�� break�� for���� ���ᰡ �ȴ�.while���� �ٽ� ���Ե�
					break;
				}
			}
			//0==0 Ʈ��
			if(i==index) {
				//lotto 0�� �ε����� ran�� �߰�, if�������� index +1
				lotto[index++] = ran;
//				System.out.println(lotto[0]);
//				System.out.println(index);

			}
			//index�� 6�� ������ while���� ����{ } ��ġ�� ��!!Ȯ������
			//while�� �ٷ� �ȿ��� break�� �߱⿡ break�ɸ� ��������
			if(index==6) { 
				break;
			}
		}
		System.out.println(Arrays.toString(lotto));

	}
}	


