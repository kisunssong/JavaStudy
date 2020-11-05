class Product {
	String name;
	int price;
	
	Product(String name, int price) {
		this.name=name; this.price=price;
	}
	Product(String name) {
		this(name,500);
	}
	Product(int price) {
		this("물",price);
	}
	Product() {	
	}
}

public class ConEx02 {
	public static void main(String[] args) {
		
		Product p1=new Product("웰치스", 700);
		Product p2=new Product("커피");
		Product p3=new Product(500);
		Product p4=new Product();
		
		System.out.println(p1.name+", "+p1.price);
		System.out.println(p2.name+", "+p2.price);
		System.out.println(p3.name+", "+p3.price);
		
	}
}
