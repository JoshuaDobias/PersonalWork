package oOP;

public class Employee {
	
private double wage=7.25;
private double experience=70;
public double getWage() {
	return wage;
}
public void setWage(int xWage) {
	wage=xWage;
	
}
public double getExperience() {
	return experience;
}
public void setExperience(double exp) {
	experience=exp;
}
public void getRaise() {
	
	double raise=wage*1.1;
	wage=raise;
}
}
