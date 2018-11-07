package rN;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		int min = 1;
		int max = 2;
		int heads = 0;
		int tails = 0;
		Random generater = new Random();
		for (int count = 1; count <= 100000; count++) {
			int randomNum = min + generater.nextInt(max - min + 1);
			if (randomNum == 1) {
				heads++;
			} else {
				tails++;
			}

		}
		System.out.println("heads: " + heads);
		System.out.println("Tails: " + tails);

	}

}
