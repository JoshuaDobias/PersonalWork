package mathOpps;
import java.util.Scanner;
public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.println("How wide is your wall in feet if the height is 8 ft tall?");
		int lenght = input.nextInt();
		int area=lenght*8;
		System.out.println("The area of your wall is " + area + " ft^2");
		
	}

}
