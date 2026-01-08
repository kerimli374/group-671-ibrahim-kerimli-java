package classwork_3;

public class Classwork_3 {
	public static void main(String[] args) {
		int sleeptime = 3;
		
		if (sleeptime < 6) {
			System.out.println("Мало спал, пора отдохнуть!");
		}else if (sleeptime >= 6 && sleeptime <= 8) {
			System.out.println("Нормально, бодрый день");
		}else if (sleeptime >= 8 && sleeptime <= 9) {
			System.out.println("Нормально, бодрый день");
		}else {
			System.out.println("Переспал, пора вставать!");
		}

	}
}
