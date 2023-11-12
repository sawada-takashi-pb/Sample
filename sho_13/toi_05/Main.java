package sho_13.toi_05;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Item> list = List.of(
					new Item("apple", 100),
					new Item("banana", 200),
					new Item("apple", 41)
				);
		
		double result = list.stream()
				.filter(e -> e.getName().equals("apple"))
				.mapToInt(Item::getPrice)
				.average()
				.getAsDouble();
		
		System.out.println(result);
		
	}

}
