
public class Hong_StarExample {
	
	public static void main(String[] args) {
		
		int floor = 5;
		
		for (int i=0; i < floor; i++) {
			for (int j=0; j < i+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}		
		System.out.println("-----------------------");

		for (int i=0; i < floor; i++) {
			for (int j=0; j < floor-i; j++) {
				System.out.printf("*");		
			}
			System.out.println();
		}		
		System.out.println("-----------------------");
		
		for (int i=0; i < floor; i++) {
			for (int j=0; j < floor-i-1; j++) {
				System.out.printf(" ");		
			}
			for (int j=0; j < i+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		for (int i=0; i < floor; i++) {
			for (int j=0; j < floor-i-1; j++) {
				System.out.printf(" ");
			}
			for(int j=0; j < (i+1)*2-1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
		for (int i=0; i < floor; i++) {
			for (int j=0; j < floor-1; j++) {
				System.out.printf(" ");
			}
			for(int j=0; j < floor-1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}