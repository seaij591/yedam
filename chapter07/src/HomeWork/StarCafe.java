package HomeWork;

public class StarCafe {
	private String cafeName;
	private int money;
	private int passengerCount;
	
	public StarCafe(Staring cafeName) {
		this.cafeName = cafeName;
	}
	
	public void take(int money) {
		this.money += money;
		
	}
}
