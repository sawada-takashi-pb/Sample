package sho_05.toi_02;

import java.io.File;

public class isFilesSample {

	public static void main(String[] args) {
		File rootDir = new File(".");
		showTree(rootDir);
	}
	
	private static void showTree(File dir) {
		File[] files = dir.listFiles();
		for(File file : files) {
			System.out.println(file.getName());
		}
		
	}

}
