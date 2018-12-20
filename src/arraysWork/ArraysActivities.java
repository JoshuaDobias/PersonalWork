package arraysWork;

import java.util.Random;
import java.util.Scanner;

public class ArraysActivities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("activity");
		int activity = input.nextInt();
		switch (activity) {
		case 1:
			int j = 1;
			int[] scores = new int[5];

			System.out.println("input your scores");
			for (int i = 0; i < 5; i++) {
				j++;
				System.out.println("test score: " + j);
				scores[i] = input.nextInt();
			}
			break;
		case 2:
			int j1 = 0;
			int[] scores1 = new int[5];
			int sum = 0;
			System.out.println("input your scores");
			for (int i = 0; i < 5; i++) {
				j1++;
				System.out.println("test score: " + j1);
				scores1[i] = input.nextInt();
			}
			for (int i = 0; i < 5; i++) {
				sum = sum + scores1[i];
			}
			System.out.println(sum);
			break;
		case 3:
			int j2 = 0;
			int[] scores2 = new int[25000];
			double sum1 = 0;
			System.out.println("input your scores");
			for (int i = 0; i < 25000; i++) {
				j2++;
				System.out.println("test score: " + j2);
				scores2[i] = input.nextInt();
			}
			for (int i = 0; i < 25000; i++) {
				sum1 = sum1 + scores2[i];
			}
			System.out.println(sum1);
			break;
		case 4:
			int j3 = 0;
			int[] scores3 = new int[25000];
			System.out.println("input your scores");
			for (int i = 0; i < 25000; i++) {
				j3++;
				System.out.println("test score: " + j3);
				scores3[i] = input.nextInt();
			}
			for (int i = 25000 - 1; i >= 0; i--) {
				System.out.println(scores3[i]);
			}
			break;
		case 5:
			Random generater = new Random();
			int randomNum;
			int large = 0;
			int[] testScore = new int[250];
			for (int i = 0; i < 250; i++) {
				randomNum = 0 + generater.nextInt(100 - 0 + 1);
				System.out.println(randomNum);
				testScore[i] = randomNum;
				if (testScore[i] > large) {
					large = testScore[i];
				}
			}
			System.out.println(large);
			break;
		case 6:
			input.nextLine();
			String[] friendName = new String[20];
			System.out.println("Enter your friends names:");
			for (int i = 0; i < friendName.length; i++) {
				friendName[i] = input.nextLine();
			}
			for (int i = friendName.length - 1; i >= 0; i--) {
				System.out.println("Friend: " + (i + 1));
				System.out.println(friendName[i]);
			}
			break;
		case 7:
			input.nextLine();

			String[] name = new String[20];
			System.out.println("Enter your friends names:");
			for (int i = 0; i < name.length; i++) {
				name[i] = input.nextLine();
			}
			System.out.println("What do you want to serch for");
			String letter = input.next();
			char leter = letter.charAt(0);
			for (int i = 0; i < name.length; i++) {
				int nameLength = name[i].length();
				char lastLetter = name[i].charAt(nameLength - 1);
				if (leter == lastLetter) {
					System.out.println(name[i]);
				}
			}
			break;
		case 8:
			input.nextLine();
			String[] names = new String[20];
			System.out.println("Enter your friends names:");
			for (int i = 0; i < names.length; i++) {
				names[i] = input.nextLine();
			}
			System.out.println("length of the first names wanted?");
			int firstlength = input.nextInt();
			for (int i = 0; i < names.length; i++) {
				int m = names[i].indexOf(' ');
				if (firstlength == m) {
					System.out.println(names[i]);
				}
			}
			break;
		case 9:
			// Array of objects
			Random generater1 = new Random();
			Rectangle[] lot = new Rectangle[100];
			for (int i = 0; i < lot.length; i++) {
				int randomNum1 = 10 + generater1.nextInt(56 - 10 + 1);
				int randomNum2 = 10 + generater1.nextInt(56 - 10 + 1);
				lot[i] = new Rectangle(randomNum1, randomNum2);
			}
			int smallest = lot[0].area();
			int smallestRec = 0;
			for (int i = 0; i < lot.length; i++) {
				int small = lot[i].area();
				if (small < smallest) {
					smallest = lot[i].area();
					smallestRec = i;
				}
			}
			System.out.println("Smallest area is Rectangle: " + (smallestRec + 1) + " At an area of " + smallest);
			for (int i = 0; i < lot.length; i++) {
				System.out.println("Rectangle " + (i + 1) + " width: " + lot[i].getWidth());
				System.out.println("Rectangle " + (i + 1) + " length: " + lot[i].getLength());
				System.out.println("Rectangle " + (i + 1) + " area: " + lot[i].area());
				System.out.println();
			}
			break;
		case 10:
			// split
			input.nextLine();
			System.out.println("Enter a sentence");
			String sentence = input.nextLine();
			String[] words = sentence.split(" ");

			System.out.println("first letter of each word");
			for (int i = 0; i < words.length; i++) {
				System.out.println(words[i].charAt(0));
			}
			break;
		case 11:
			// split
			int count = 0;
			input.nextLine();
			System.out.println("Enter a sentence");
			String sentence1 = input.nextLine();
			System.out.println("Keyword");
			String keyword = input.nextLine();
			String[] search = sentence1.split(" ");
			for (int i = 0; i < search.length; i++) {
				if (search[i].equals(keyword) == true) {
					count++;
				}
			}
			System.out.println("This word shows " + count + " times");
			break;
		case 12:
			// split
			Random generater12 = new Random();
			input.nextLine();
			System.out.println("Enter a sentence");
			String sentence12 = input.nextLine();
			String[] spil = sentence12.split(" ");
			int min = 0;
			int max = spil.length - 1;
			int randomNum12 = min + generater12.nextInt(max - min + 1);
			System.out.println(spil[randomNum12]);
			break;
		case 13: // sequential searching activities
			int[] a = new int[100];
			Random gen = new Random();
			for (int i = 0; i < a.length; i++) {
				int num = 0 + gen.nextInt(499 - 0 + 1);
				a[i] = num;
				System.out.println(a[i]);
			}
			System.out.println("integer you are looking for?");
			int look = input.nextInt();
			int i = 0;
			for (int x : a) {
				if (x == look) {
					i++;
				}
			}
			System.out.println("There are " + i + " number of those integers");
			break;
		case 14:
			
			break;
		}
		input.close();
	}

}
