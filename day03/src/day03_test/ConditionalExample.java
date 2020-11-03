package day03_test;

public class ConditionalExample {
	public static void main(String[] args) {
		
		int a = 5 - (int) (Math.random()*10);
		if (args.length > 0) {
			a = Integer.parseInt(args[0]);
		}
		
		int abs = (a >= 0) ? a : -a;
		System.out.println(a + "의 절대값은 : " + abs);
	}

}
