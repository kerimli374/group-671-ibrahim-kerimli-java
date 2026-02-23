package classwork_10;

public class Kitten {
	String name;
	int ageMonths;
	int happiness;
	String color;
	
	public Kitten(String name,int ageMonths, int happiness, String color) {
		this.name = name;
		this.ageMonths = 2;
		this.happiness = 30;
		this.color = color;
	}
	
	public void play() {
		happiness += 20;
		if (happiness > 100) {
			this.happiness = 100;
		}
	}
	
	public void eat() {
		this.happiness += 15;
	}
	
	public void sleep() {
		this.happiness += 10;
	}
	
	public void starus() {
		System.out.println(name);
		System.out.println(ageMonths);
		System.out.println(happiness);
		System.out.println(color);
	}
	
	public void bonus() {
		if (happiness < 10) {
			System.out.println("мяукает очень грустно 😿");
		}
	}
}
