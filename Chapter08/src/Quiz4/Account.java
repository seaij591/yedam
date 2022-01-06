package Quiz4;

public class Account {
	//필드
	private String name;
	
	private long balance;
	
	//생성자
	
	public Account(String name) {
		this.name= name;
	}
	
	//메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		
		balance += money;
		return ;
	}
	public void withdraw(int money) {
		
		balance -= money;
		return ;
	}
}
