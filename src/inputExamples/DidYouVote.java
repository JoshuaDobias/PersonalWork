package inputExamples;

import java.util.Scanner;

public class DidYouVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vote = false;
		Scanner input = new Scanner(System.in);
		System.out.println("You Voted This Year. True or False");
		vote = input.nextBoolean();
		System.out.println("it is " + vote + " that you voted this year");
	}

}
