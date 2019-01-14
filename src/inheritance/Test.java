package inheritance;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Geo> shape = new ArrayList<Geo>();
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				shape.add(new Rectangle());
			} else {
				shape.add(new Trapezoid());
			}
			double bigboy=0;
			for(Geo x:shape) {
				if(x.area()>=0) {
					bigboy=x.area();
				}
			}
		}
	}

}
