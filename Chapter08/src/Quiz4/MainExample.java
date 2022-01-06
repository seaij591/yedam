package Quiz4;

public class MainExample {

	public static void main(String[] args) {
		// 문제4) 다음을 만족하는 클래스 Account를 작성하시오.
		// 		-필드로 예금주(String), 잔액(long)을 가진다.
		//		-생성자를 통해 예금주를 저장한다.
		//		-메서드는 다음과 같이 구성된다.
		//		1) 각 필드의 getter를 가진다.
		//		2) 메서드 deposit은 외부에서 매개변수로 받은 값을 저축한다.
		//		3) 메서드 whthdraw은 외부에서 매개변수로 받은 값을 인출한다.
		
		Account account = new Account("신용권");
		account.deposit(10000);
		account.withdraw(4800);
		System.out.println(account.getName()+ "님의 계좌 잔액은 "
				+ account.getBalance()+"입니다.");

	}

}
