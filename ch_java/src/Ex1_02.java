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
		create1.setName("����ȸ��");
		System.out.println("ȸ��: "+create1.getName());
//		create1.setSize();
		System.out.println("�뷮: "+Mp3.getSize()+"G");
	}
}
