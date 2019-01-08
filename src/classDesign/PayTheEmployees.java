package classDesign;

import java.util.Random;

public class PayTheEmployees {
	private String name;
	private double rate;
	private double hoursWorked;
	private int employeeID=1;
	private static int id;
	Random gen=new Random();
	int min=0;
	int max=40;
	public PayTheEmployees() {
		name = "John Smith";
		rate=10.0;
		hoursWorked=min + gen.nextInt(max - min + 1);
		employeeID=id;
		id+=1;
	}
}
