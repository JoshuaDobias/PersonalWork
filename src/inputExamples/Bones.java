package inputExamples;
import java.util.Scanner;
public class Bones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brokenBones = 0;
		Scanner input= new Scanner (System.in);
		System.out.println("How many Bones Have You Broken in Your Life?");
		brokenBones=input.nextInt();
		System.out.println("You've Broken " + brokenBones + " bones in your life");
		
	}

}
