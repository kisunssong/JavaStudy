class HandPhone {
	protected String model;
	protected String number;
	public HandPhone() {
	}
	public HandPhone(String model, String number) {
		this.model=model; this.number=number;
	}
	String prnDicaPhone() {
		return "�𵨸�: "+model+"��ȣ: "+number;
	}
	
}//HandPhone class

class DicaPhone extends HandPhone {
	String pixel;
	public DicaPhone() {		
	}
	public DicaPhone(String model, String number, String pixel) {
		super(model,number);
		this.pixel=pixel;
	}
	String prnDicaPhone() {
		return super.prnDicaPhone()+" ȭ�Ҽ�: "+pixel;
	}
}//DicaPhone class

public class Ex16_05 {
	public static void main(String[] args) {
		DicaPhone dp = new DicaPhone("�ſ�","010","1024");
		System.out.println(dp.prnDicaPhone());
	}
}
