package sho_05.toi_01;

import java.io.File;
import java.io.IOException;


//ファイルを作成し、その絶対パスを取得する
public class FileSample {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");
		if(file.exists()==false) {
			file.createNewFile();
		}
		System.out.println(file.getAbsolutePath());
	}

}
