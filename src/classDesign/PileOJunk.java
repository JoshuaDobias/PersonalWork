package classDesign;

import java.util.Random;

public class PileOJunk {
	Random gen = new Random();
	private int randomNum = 10 + gen.nextInt(100 - 10 + 1);
	private static int id = 0;
	private int classId;

	public PileOJunk() {
		classId = id;
		id += 1;
	}

	public static int add(int xfirst, int xsecond) {
		return xfirst+xsecond;
	}

	public void setRandomNum(int randomNum) {
		this.randomNum = randomNum;
	}

}