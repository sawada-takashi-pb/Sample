package sho_08.toi_02;

@Test(name = "test", price = 100)
public class Item {
	private String name;
	private int price;

	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}


}
