package sho_10.toi_07;

import java.io.FileReader;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class Sample {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileReader("./src/sho_10/toi_07/Sample.properties"));

		
		//Propertiesファイルの値を出力するいろいろな方法
		System.out.println("------------------------------");
		Set keys = prop.keySet();
		for (Object key :keys) {
			System.out.println(prop.get(key));
		}
				
		System.out.println("------------------------------");
		prop.forEach((k,v) -> System.out.println(v));
		
		System.out.println("------------------------------");
		prop.list(System.out);
		
		System.out.println("------------------------------");
		System.out.println(prop.getProperty("name1"));

		//ResouceBundleを利用して読み込む
		System.out.println("------------------------------");		
		ResourceBundle resource = ResourceBundle.getBundle("toi_07.sample");
		System.out.println(resource.getString("name2"));
		
		
		
	}

}
