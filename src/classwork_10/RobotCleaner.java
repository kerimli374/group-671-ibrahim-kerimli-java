package classwork_10;

public class RobotCleaner {
	String name; 
	int battery;
	boolean isWorking;
	
	public RobotCleaner(String name, int battery, boolean isWorking) {
		this.name = name;
		this.battery = 100;
		this.isWorking = false;
	}
	
	public void start() {
		if(battery > 10) {
			this.isWorking = true;
			System.out.println("Я начал убирать!");
		}
	}
	
	public void stop() {
		this.isWorking = false;
		System.out.println("Уборка закончена");
	}
	
	public void charge() {
		this.battery = 100;
		System.out.println("Полная зарядка!");
	}
}
