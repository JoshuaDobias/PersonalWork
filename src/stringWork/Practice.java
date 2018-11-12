package stringWork;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Activity?");
		int activity = input.nextInt();
		switch (activity) {
		case 1:
			System.out.println("what is your age");
			int age = input.nextInt();
			input.nextLine();
			System.out.println("What is your name?");
			String name = input.nextLine();
			System.out.println("Age=" + age + " your name " + name);
			break;
		case 2:
			input.nextLine();
			System.out.println("Go ahead, write a nice sentence.");
			String test=input.nextLine();
			System.out.println(test.charAt(0));
			System.out.println(test.charAt(2));
			System.out.println(test);
			break;
		case 3:
			input.nextLine();
			System.out.println("Write a sentence with out without Bob in it");
			String sentence=input.nextLine();
			System.out.println(sentence.contains("Bob"));
			System.out.println(sentence);
			break;
		case 4:
			input.nextLine();
			System.out.println("Enter a name with proper english.");
			String name1=input.next();
			System.out.println("Enter another name with proper english");
			String name2=input.next();
			if(name1.compareTo(name2)<0);{
			System.out.println("The first name comes first");}
			if(name2.compareTo(name1)<0) {
				System.out.println("The second name comes first");
			}
			
		}
		
	}

}
