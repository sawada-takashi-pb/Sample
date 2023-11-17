package sho_13.toi_45;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomSample {

	public static void main(String[] args) {
		var r = new Random();
		IntStream.generate(r::nextInt)
			.limit(10)
			.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
//		nextIntはRandomのインスタンスメソッドなので、以下の書き方ではエラーになる
//		IntStream.generate(Random:nextInt)
//			.limit(10)
//			.forEach(System.out::println);
		
	}

}
