package classDesign;

public class Student {

	private String name = "";
	private double[] test = new double[5];
	private int howMany = 0;
	private int count = 0;

	public Student() {
		if (name.equals("")) {
			name = "student";
		}
	}

	public void addaScore(double newTest) {
		if(newTest>100||newTest<0) {
			System.out.println("score out of bounds, didn't count");
			test[count]=0;
		}
		test[count] = newTest;
		count++;
		if (count > test.length) {
			count = 0;
		}
	}

	public double averageScore() {
		double score = 0;
		for (int i = 0; i < test.length; i++) {
			
			score += test[i];
		}
		double avg = score / (test.length + 1);
		return avg;
	}

	public double lowestScore() {
		
	}
}
