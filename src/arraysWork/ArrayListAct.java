package arraysWork;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListAct {

	public static void main(String[] args) {
		Random generator = new Random();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Activity:");
		int activity = input.nextInt();
		int min = 50;
		int max = 70;
		switch (activity) {
		case 1:
		ArrayList<String> names = new ArrayList<String>();	
		names.add("bob");
		names.add("joe");
		names.add("sue");
		break;
		case 2:
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("bob");
		names1.add("jane");
		names1.add(0, "Billy");
		break;
		case 3:
			ArrayList<String> names2 = new ArrayList<String>();
			names2.add("bob");
			names2.add("jane");
			names2.add(0, "Billy");
			input.nextLine();
			System.out.println("Type your name");
			names2.add(input.nextLine());
			break;
		case 4:
			ArrayList<Friend> friend = new ArrayList<Friend>();
			while(friend.size() < 3) friend.add(null);
			friend.set(2, new Friend("James",10));
			friend.set(1, new Friend("Hoe",12));
			friend.set(0,new Friend("Honedo",9));
			break;
		case 5:
			ArrayList<Friend> friend1 = new ArrayList<Friend>();
			friend1.add(new Friend("bob",10));
			friend1.add(new Friend("jane",12));
			friend1.add(1, new Friend("billy",9));
			System.out.println("Your Name");
			input.nextLine();
			String name=input.nextLine();
			System.out.println("Your age ");
			friend1.add(new Friend(input.nextLine(),10));
			for (int i=0; i<friend1.size(); i++) {
				System.out.println(friend1.get(i));
			}
			break;
		case 6:
			ArrayList<Friend> friend2 = new ArrayList<Friend>();
			while(friend2.size() < 3) friend2.add(null);
			friend2.set(2, new Friend("James",10));
			friend2.set(1, new Friend("Hoe",12));
			friend2.set(0,new Friend("Honedo",9));
			for (int i=0; i<friend2.size(); i++) {
				Friend person=friend2.get(i);
				System.out.println(person.getAge());
			}
			break;
		case 7:
			ArrayList<Rectangle> rectangle= new ArrayList<Rectangle>();
			for (int i=0; i<=400; i++) {
				int randomNumW=min+generator.nextInt(max-min+1);
				int randomNumL=min+generator.nextInt(max-min+1);
				rectangle.add(new Rectangle(randomNumL,randomNumW));
			}
			for (int i=rectangle.size()-1; i>0;i--) {
				Rectangle area=rectangle.get(i);
				System.out.println(area.area());
			}
			break;
		case 8: //Removing elements kicks it down on element
			int choice=0;
			ArrayList<String> student=new ArrayList();
			while(choice==0) {
				input.nextLine();
				System.out.println("enter student name");
				student.add(input.nextLine());
				System.out.println("1 to quit, 0 to continue");
				choice=input.nextInt();
			}
			student.remove(0);
			student.remove(student.size()-1);
			System.out.println(student);
		}

	}
}
