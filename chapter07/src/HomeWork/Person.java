package HomeWork;

public class Person {
	
	public String name;
	public int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyCoffee(BeanCafe cafe) {
		this.money -= 4000;
		cafe.take(4000);
	}
	public void buyCoffee(StarCafe cafe) {
		this.money -= 4500;
		cafe.take(4500);
	}
	public void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d입니다.\n",name,money);
	}
}
