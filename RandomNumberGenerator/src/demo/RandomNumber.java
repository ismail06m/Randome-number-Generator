package demo;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int num = 100000 + random.nextInt(100000, 1000000);
		System.out.println(num);

	}

}
