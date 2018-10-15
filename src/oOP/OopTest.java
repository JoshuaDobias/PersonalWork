package oOP;

public class OopTest {

	public static void main(String[] args) {
		Greeter bob = new Greeter();

		bob.sayHello();
		bob.sayHello();
		bob.sayHello();
		Friend john = new Friend();
		john.sayMessage();
		bob.sayHello();
	}
}
