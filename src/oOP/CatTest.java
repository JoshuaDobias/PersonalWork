package oOP;
import java.util.Scanner;
public class CatTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Cat mew=new Cat();
		System.out.println("How much sleep does your cat get: ");  mew.setSleep(input.nextInt());
		System.out.println("How old is your cat: "); mew.setAge(input.nextInt());
		mew.birthday();
		mew.sleepLess();
		mew.sleepMore();
	}

}
