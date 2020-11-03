package static_.calc;

public class Calculator {
	
	/*
	 * 계산기 별로 색깔이 다를 수 있기 때문에 color같은 변수는
	 * 데이터를 공유시켜서는 안됩니다.
	 * 
	 * 하지만 pi같은 원주율값은 계산기마다 동일하기 때문에
	 * 공유해서 사용하는 것이 더 바람직 합니다.
	 */
	
	private String color;
	public static double pi;
	
	/*
	 * 일반 멤버변수를 사용하고 있는 메서드는 정적메서드로 선언하면 안됨!
	 */
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	/*
	 * 메서드 내부에서 일반 멤버변수를 참조하지 않고, 범용성 있게
	 * 사용되는 메서드 static키워드를 사용하여 정적 메서드로 선언하는
	 * 것이 좋습니다.
	 */
	public static double areaCircle(int r) {
		return r * r * pi;
	}
}
