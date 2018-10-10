package oOP;

public class Cat {
	
	private int age;
	private int sleep;
	public Cat() {}
	public Cat(int age, int sleep) {
		age=5;
		sleep=10;
	}
	
	public void setAge(int nage) {
		age=nage;
	}
	public void setSleep(int nsleep) {
		sleep=nsleep;
	}
	
	public int birthday() {
		System.out.println("Congrats, its is your cats birthday!");
		age=age+1;
		System.out.println("Your cat is now "+age+" years old");
		return age;
	}
	public int sleepMore() {
		System.out.println("your cat doesn't sleep long enough at "+sleep+" hours");
		sleep=sleep+2;
		System.out.println("Cat should get " + sleep+" hours");
		return sleep;
	}
	public int sleepLess() {
		System.out.println("your cat sleeps too long at "+sleep+" hours");
		sleep=sleep-2;
		System.out.println("Cat should get " + sleep+" hours");
		return sleep;
	}
}
