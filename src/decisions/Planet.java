package decisions;

public class Planet {

	public Planet(){}
	private int planet;
	private int weight;
	public void setPlanet(int setPlanet) {
		planet=setPlanet;
	}
	public void setWeight(int setWeight) {
		weight=setWeight;
	}
	public int getPlanet() {
		return planet;
	}
	public void showPlanet() {
		switch(planet) {
		case 1:
			System.out.println("You will be on Mercury");
			double grav=weight*.37;
			System.out.println("You would weight " + grav + " pounds");
			break;
		case 2:
			System.out.println("You will be on Venus");
			grav=weight*.88;
			System.out.println("You would weight " + grav + " pounds");
			break;
		case 3:
			System.out.println("You will be on Mars");
			grav=weight*.38;
			System.out.println("You would weight " + grav + " pounds");
			break;
		case 4:
			System.out.println("You will be on Jupiter");
			grav=weight*2.68;
			System.out.println("You would weight " + grav + " pounds");
			break;
		case 5:
			System.out.println("You will be on Saturn");
			grav=weight*1.15;
			System.out.println("You would weight " + grav + " pounds");
			break;
		default:
			System.out.println("That is not a choice");
		}
		
		
	}
	
}
