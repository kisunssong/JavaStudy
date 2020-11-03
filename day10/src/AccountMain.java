import java.util.Scanner;

/*
	 * 1. 멤버변수는 예금주이름(name : String),
	 * 비밀번호(password: int), 잔액(balance: int)
	 * 로 선언하세요
	 * 2. 생성자는 3가지 멤버변수를 모두 매개값으로 받아
	 * 초기화하는 생성자를 선언하세요.
	 * 3.메서드는 입금기능 메서드(deposit : void)
	 * 출금기능 메서드(withDraw : void),
	 * 잔액 조회기능 메서드(getBalance: int)
	 * 3가지를 선언하세요.
	 */


public class AccountMain {
	

		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계좌를 등록합니다.");
		
		System.out.printf("이름: ");
		String name = scan.next();
		
		System.out.printf("비밀번호: ");
		int password = scan.nextInt();
		
		System.out.printf("입금액: ");
		int deposit = scan.nextInt();
		Account list = new Account(name, password, deposit);
		
		
		while(true) {

			System.out.println("메뉴를 입력하세요.");		
			System.out.println("1. 예금 / 2. 출금 / 3. 잔액조회 / 4. 종료");
			System.out.printf("> ");
			
			int number = scan.nextInt();
			
			switch(number) {
			
			case(1):
				System.out.println("계좌 비밀번호를 입력하세요");
				System.out.printf("> ");
				int p1review = scan.nextInt();
				if (p1review == list.password) {
					System.out.println("입금액을 입력하세요.");
					System.out.printf("> ");
					int depositmoney = scan.nextInt();
					list.deposit (depositmoney);
					System.out.println("입금이 완료되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
					break;
				}
				
			case(2):
				System.out.println("계좌 비밀번호를 입력하세요");
				System.out.printf("> ");
				int p2review = scan.nextInt();
				if (p2review == list.password) {
					System.out.println("출금액을 입력하세요.");
					System.out.printf("> ");
					int withDraw = scan.nextInt();
					if(withDraw > list.getBalance()) {
						System.out.println("잔액이 부족합니다.");
						break;
					}else {
						list.withDraw(withDraw);
						System.out.printf("%d원 출금이 완료되었습니다.%n", withDraw);
						System.out.printf("남은 잔액은 %d원 입니다.", list.getBalance());
						break;
					}
					
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
				break;
			}
			
			case(3):
				System.out.println("계좌 비밀번호를 입력하세요");
				System.out.printf("> ");
				int p3review = scan.nextInt();
				if (p3review == list.password) {
					System.out.printf("%s님의 계좌 잔액은 %d원 입니다.%n", list.name, list.getBalance());
					break;
				}else {
					
					System.out.println("비밀번호가 틀렸습니다.");
					break;
				}
				
			case(4):		
				scan.close();
				System.exit(0);
				break;
			}
		}
		
	}
	
}

