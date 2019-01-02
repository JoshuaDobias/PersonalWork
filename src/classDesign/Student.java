package classDesign;

import java.util.ArrayList;

public class Student {

	private String name = "";
	private double[] test = new double[5];
	private int howMany = 5;
	private int count = 0;
	
	public Student() {
		if (name.equals("")) {
			name = "student";
		}
	}

	public void addaScore(double newTest) {
		
		test[count] = newTest;
		count++;
		if (count > test.length) {
			count = 0;
		}
	}

	public double averageScore() {
		double score = 0;
		
		for (int i = 0; i < test.length; i++) {
			if(test[i]>100||test[i]<0) {
			System.out.println("score out of bounds, didn't count at index"+(i+1));
			test[i]=0;
			howMany--;
		}
			score += test[i];
		}
		double avg = score / howMany;
		return avg;
	}

	public double lowestScore() {
		double check=0;
		for (double x: test) {
			if (x<100) {
				check=x;
			}
		}
		return check;
	}
	public String toString() {
		return "Student class with " + test.length+ " amount of elements with name of " + name;
	}
	public Student clone() {
		return new Student();
	}
	public boolean equals(Student Student) {
		return (this.toString().equals(Student.toString()));
	}
}
