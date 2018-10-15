package oOP;

public class TestGreeter {

	public static void main(String[] args) {
		Greeter bob=new Greeter();
		
		System.out.println(bob.getAge());
		bob.setAge(50);
		System.out.println(bob.getAge());

	}

}
