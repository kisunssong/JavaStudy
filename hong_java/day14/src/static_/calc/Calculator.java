package static_.calc;

public class Calculator {
	
	/*
	 * ���� ���� ������ �ٸ� �� �ֱ� ������ color���� ������
	 * �����͸� �������Ѽ��� �ȵ˴ϴ�.
	 * 
	 * ������ pi���� ���������� ���⸶�� �����ϱ� ������
	 * �����ؼ� ����ϴ� ���� �� �ٶ��� �մϴ�.
	 */
	
	private String color;
	public static double pi;
	
	/*
	 * �Ϲ� ��������� ����ϰ� �ִ� �޼���� �����޼���� �����ϸ� �ȵ�!
	 */
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	/*
	 * �޼��� ���ο��� �Ϲ� ��������� �������� �ʰ�, ���뼺 �ְ�
	 * ���Ǵ� �޼��� staticŰ���带 ����Ͽ� ���� �޼���� �����ϴ�
	 * ���� �����ϴ�.
	 */
	public static double areaCircle(int r) {
		return r * r * pi;
	}
}
