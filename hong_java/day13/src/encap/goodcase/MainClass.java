package encap.goodcase;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth b = new MyBirth();
		/*
		 * b.year = 2018; 
		 * b.month = 15; 
		 * b.day = 40;
		 System.out.println(b.year);*/
		
		b.setYear(2020);
		b.setMonth(11);
		b.setDay(17);
		System.out.println(b.getYear());
		System.out.println(b.getMonth());
		System.out.println(b.getDay());
		b.info();
		
		//alt + shift + S or ¸¶¿ì½º space
		
		


	}

}
