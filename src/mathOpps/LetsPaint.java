package mathOpps;
import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("What is the length and width of your 8 feet tall room?");
		System.out.println("Length"); int length=input.nextInt();
		System.out.println("width"); int width=input.nextInt();
		int area1= length*8; System.out.println("Area of length: " + area1 + " ft^2");
		int area2=width*8; System.out.println("Area of width: " + area2 + " ft^2");
		int lWall=area1*2;
		int wWall=area2*2;
		double paint=((double)lWall + (double)wWall)/150.0;
		System.out.println("Gallons of paint needed to cover walls: " + paint);
		input.close();
	}

}
