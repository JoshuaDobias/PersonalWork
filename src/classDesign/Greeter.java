package classDesign;

public class Greeter {
	public Greeter(int xage) {
		age=xage;
	}
	private int age;
	public Greeter()
	{age=23;}
	
	public void sayHello() 
	{
	System.out.println("Hello");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		age=newAge;
	}
}
