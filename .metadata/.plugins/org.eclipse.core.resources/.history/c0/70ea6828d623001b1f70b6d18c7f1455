class HandPhone {
	protected String model;
	protected String number;
	public HandPhone() {
	}
	public HandPhone(String model, String number) {
		this.model=model; this.number=number;
	}
	String prnDicaPhone() {
		return "모델명: "+model+"번호: "+number;
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
		return super.prnDicaPhone()+" 화소수: "+pixel;
	}
}//DicaPhone class

public class Ex16_05 {
	public static void main(String[] args) {
		DicaPhone dp = new DicaPhone("거원","010","1024");
		System.out.println(dp.prnDicaPhone());
	}
}
