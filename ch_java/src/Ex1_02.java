class Mp3 {
	private String name;
	private static int size=8;
	
	void setName(String mp3name) {
		name = mp3name;
	}
	public String getName() {
		return name;
	}
	
	public static int getSize() {
		return size;
	}
}


public class Ex1_02 {
	public static void main(String[] args) {
		
		Mp3 create1=new Mp3();
		create1.setName("값을회사");
		System.out.println("회사: "+create1.getName());
//		create1.setSize();
		System.out.println("용량: "+Mp3.getSize()+"G");
	}
}
