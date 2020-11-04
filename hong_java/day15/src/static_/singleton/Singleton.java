package static_.singleton;

public class Singleton {
	
	/*
	 * �̱��� ���� - ��ü�� ������ 1���� �����ϱ� ���� ������ ����.
	 * 
	 * 1. �ܺο��� �� Ŭ������ ��ü�� ������ �� ������
	 * �����ڸ� ��1���� �����ϰ� private ������ ����,
	 */
	private Singleton() {}
	
	/*
	 * 2. �ڽ��� Ŭ���� ���ο��� �������� ��ü�� 1�� �����մϴ�.
	 */
	private static Singleton instance = new Singleton();
	
	/*
	 * 3. �ܺο��� �� Ŭ������ ��ü ������ �䱸�� ���
	 * 2������ �̸� ������ �� �ϳ��� ��ü�� ������ �޼��带
	 * ���� �����մϴ�.
	 */
	public static Singleton getInstance() {
		return instance;
	}
	
}
