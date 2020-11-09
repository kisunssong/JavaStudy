class Product {
	private String name;
	private int price;
	
	Product() {
	}
	Product(String name, int price) {
		this.name=name; this.price=price;
	}
	Product(String name) {
		this(name,800);
	}
	Product(int price) {
		this("물",price);
	}
	public void info() {
		System.out.println("음료:"+name+", 가격:"+price);
	}
}

public class ConEx02 {
	public static void main(String[] args) {
		
		Product p1=new Product("웰치스",500);
		p1.info();
		Product p2=new Product("커피");
		p2.info();
		Product p3=new Product(500);
		p3.info();
		Product p4=new Product();
		p4.info();
				
	}
}
