package day04;

import java.util.Arrays;

public class Hong_Arraybasic {
	
	public static void main(String[] args) {
		
		//1. �迭�� ���� - stack�� �迭������ ����.
		int score[]; // �ڹ� ��Ÿ��
		
		//2. �迭�� ���� - Heap�� ���� �����Ͱ� ���� �� ������ ����.
		//�迭�� ������ ũ�⸦ �����. �ѹ� ������ ũ��� ���� �Ұ�.
		score = new int[5];
		System.out.println(score);
		
		//3. �迭�� �ʱ�ȭ - �迭�� ���� �����ϴ� ����
		score[0] = 87;
		score[2] = 99;
		score[3] = score[0];		
		
		//4. �迭�� �� ����(���)
		System.out.println("�迭�� 3��° �����Ͱ�: " + score[2]);
		System.out.println("�迭�� 4��° �����Ͱ�: " + score[3]);
		System.out.println("�迭�� 5��° �����Ͱ�: " + score[4]);
		
		/*
		 * �迭 ���ο� ����� ������ �Ѵ��� ���ڿ� ���·�
		 * Ȯ���غ����� ��¸޼���  println�� �Ű�������
		 * Arrays.toString (�迭������)�� ���� �˴ϴ�. 
		 */
		System.out.println(Arrays.toString(score));
		
		//�迭�� ���̸� �˾ƺ����� �迭������.length ����� ���.
		System.out.println("�迭�� ���� : " + score.length);
		
		//�迭�� ����� ������ ���ÿ� �ϴ� ���.
		byte[] bArr = new byte[7];
		
		//�迭�� ����� ������ �ʱ�ȭ�� ���ÿ� �ϴ� ���.
		char[] letters = new char[] {'��', '��', '��', '��'};
		System.out.println(Arrays.toString(letters));
		
		//�� �����ϰ�
		String[] names = {"ȫ�浿", "�Ż��Ӵ�", "�̼���"};
		System.out.println(Arrays.toString(names));
		
		//�䷸�Ե� �ȴ�.
		String[] aaa;
		aaa = new String[50];
		
		
		
	}

}
