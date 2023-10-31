package sho_08.toi_02;

public class ItemMain {

	public static void main(String[] args) {
		Class<Item> clazz = Item.class;
		Test test = clazz.getAnnotation(Test.class);
		
		if(test == null) {
			System.out.println("アノテーションはありません");
		}
	}

}
