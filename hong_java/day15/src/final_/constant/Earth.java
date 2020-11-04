package final_.constant;

public class Earth {
	
	public static final double EARTH_RADIUS = 6400;
	public static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * EARTH_RADIUS * EARTH_RADIUS * Math.PI;
	}
	
	public static void main(String[] args) {
	
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + "km");
	
	}

}
