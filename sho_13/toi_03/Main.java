package sho_13.toi_03;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {

	public static void main(String[] args) {
		Iterator<Test> loader = 
				ServiceLoader.load(Test.class).iterator();
		
//		for (Test test : loader) {
//			test.execute();
//		}
		
		while (loader.hasNext()) {
			Test test = loader.next();
			System.out.println(test.execute());
			
		}
		
	}

}
