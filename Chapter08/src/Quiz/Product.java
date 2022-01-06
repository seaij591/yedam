package Quiz;

public class Product {
	//필드
	public String name;
	public int price;
	
	//생성자
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
	//메서드
	public void setName(String name) {
		this.name = name;
	
	}
	
	
}
