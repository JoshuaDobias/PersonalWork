package oOP;

public class Worker {
		private int hours;
		private double pay;
		public Worker() {}
		public Worker(int hours, double pay) {
			hours=10;
			pay=7.25;
		}
		public int getHours() {
			return hours;
		}
		public double getPay() {
			return pay;
		}
		public void setHours(int newH) {
			hours=newH;
		}
		public void setPay(double newP) {
			pay=newP;
		}
		
		public double Paycheck() {
			double paycheck=hours*pay;
			return paycheck;
		}
		public void raise(double raise) {
			raise=pay*raise;
			pay=raise;
		}
}
