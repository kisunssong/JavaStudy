
public class ForStarExample {
	public static void main(String[] args) {
		
//		int dan = 5;
//		for (int i=0; i<dan; i++) {
//			for (int j=0; j<i+1; j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
		//   *  만들기   
//		    ***   
//		   *****  
//		  ******* 
//		 *********
		int star1 = 5;
		String gon = " ";
		for (int i=0; i<star1; i++) {
			for (int j=0; j<i+1; j++) {
				for (int c=0; c<i-1; c++) {
				System.out.printf("*");
			}
			System.out.println();
			}
		}
	}


}
