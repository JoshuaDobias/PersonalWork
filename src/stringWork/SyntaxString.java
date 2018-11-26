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
			// toUpperCase
			input.nextLine();
			System.out.println("Type a Name");
			String name3 = input.nextLine();
			name3.toUpperCase();
			System.out.println("Enter another Name");
			String name4 = input.nextLine();
			name4.toUpperCase();
			if (name3.compareTo(name4) < 0) {
				System.out.println("First " + name3.toUpperCase());
			} else if (name4.compareTo(name3) < 0) {
				System.out.println("First " + name4.toUpperCase());
			}
			break;
		case 12:
			input.nextLine();
			System.out.println("Set Password:");
			String password = input.nextLine();
			while (1 == 1) {
				System.out.println("Enter Password");
				String checkPassword = input.nextLine();
				if (checkPassword.equals(password)) {
					System.out.println("logging in");
					break;
				} else {
					System.out.println("Incorrect Password");
					System.out.println();
				}
			}
			break;
		case 13:
			input.nextLine();
			int x = 0;
			System.out.println("write a sentence");
			String sentence13 = input.nextLine();
			for (int i = 1; i < sentence13.length()+1; i++) {
				x = i % 4;
				if (x == 0) {
					System.out.println(sentence13.charAt(i - 1));
				}
			}
			break;
		case 14:
			input.nextLine();
			System.out.println("Write a sentence");
			String sentence14=input.nextLine();
			for (int i=0; i<sentence14.length(); i++) {
				if(sentence14.charAt(i)!='a' && sentence14.charAt(i)!=' ') {
				System.out.print(sentence14.charAt(i));}
				else {System.out.print("");}
			}
			System.out.println();
			System.out.println("What you wrote: "+sentence14);
		}

	}

}
