package stringWork;

import java.util.Scanner;

public class SyntaxString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Activity?");
		int activity = input.nextInt();
		switch (activity) {
		case 1:
			// String setup
			System.out.println("what is your age");
			int age = input.nextInt();
			input.nextLine();
			System.out.println("What is your name?");
			String name = input.nextLine();
			System.out.println("Age=" + age + " your name " + name);
			break;
		case 2:
			// charAt (starts at 0)
			input.nextLine();
			System.out.println("Go ahead, write a nice sentence.");
			String test = input.nextLine();
			System.out.println(test.charAt(0));
			System.out.println(test.charAt(2));
			System.out.println(test);
			break;
		case 3:
			// contains
			input.nextLine();
			System.out.println("Write a sentence with out without Bob in it");
			String sentence = input.nextLine();
			System.out.println(sentence.contains("Bob"));
			System.out.println(sentence);
			break;
		case 4:
			// compareTo (might be better to use compareToignoreCase)
			input.nextLine();
			System.out.println("Enter a name with proper english.");
			String name1 = input.next();
			System.out.println("Enter another name with proper english");
			String name2 = input.next();
			if (name1.compareTo(name2) < 0) {
				System.out.println("The first name comes first");
			} else if (name2.compareTo(name1) < 0) {
				System.out.println("The second name comes first");
			}
			break;
		case 5:
			// IndexOf
			input.nextLine();
			System.out.println("Write a sentance");
			String sentence5 = input.nextLine();
			System.out.println(sentence5.indexOf('x'));
			;
			break;
		case 6:
			// length
			input.nextLine();
			System.out.println("enter a sentence");
			String sentence6 = input.nextLine();
			System.out.println("This sentence has " + sentence6.length() + " letters in it");
			break;
		case 7:
			// length counts index so it starts at 1, index starts at 0
			input.nextLine();
			System.out.println("Write a senence");
			String sentence7 = input.nextLine();
			for (int i = 0; i < sentence7.length(); i++) {
				System.out.println(sentence7.charAt(i));
			}
			break;
		case 8:
			String text = "My name is Buzz Lightyear!";
			for (int i = 0; i < text.length(); i++) {
				System.out.println(text.substring(i));
			}
			break;
		case 9:
			// substring example ( end is non-inclusive
			String text1 = "My name is Buzz Lightyear!";
			for (int i = 0; i < text1.length(); i++) {
				System.out.println(text1.substring(0, i + 1));
			}
			break;
		case 10:
			// toLowerCase
			input.nextLine();
			System.out.println("Write a sentence");
			String text0 = input.nextLine();
			System.out.println("lower case: " + text0.toLowerCase());
			System.out.println("Regular:" + text0);
			break;
		case 11:
			input.nextLine();

		}

	}

}
