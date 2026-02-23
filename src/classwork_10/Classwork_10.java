package classwork_10;

public class Classwork_10 {
	public static void main(String[] args) {
		RobotCleaner vacuumcleaner = new RobotCleaner("natasha",88,false);
		vacuumcleaner.start();
		vacuumcleaner.stop();
		vacuumcleaner.charge();
	}
}
