package inputExamples;
import java.util.Scanner;
public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight = 0;
		int age = 0;
		Scanner input= new Scanner (System.in);
		System.out.println("How Old are you?");
		age=input.nextInt();
		System.out.println("You are " + age + " years old");
		//System.\\///\/\/\//\/\/\/\\//\\//\/\\/\///\\//\\/\/\/\\/\\/\\/\/\/\/\/\/\\/\
		System.out.println("How much do you weigh in pounds");
		weight=input.nextInt();
		System.out.println("You weigh " + weight+" pounds");
	}

}
