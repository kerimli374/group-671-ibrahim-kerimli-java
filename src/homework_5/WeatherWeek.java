package homework_5;

public class WeatherWeek {
		double[] temperature7 = {18.4, 19.7, 17.2, 20.9, 16.8, 21.3, 18.1};
		public void roundoffthetemperature(double t) {
			Math.round(t);
			System.out.println("Температура за неделю:");
			int beasthot = -100;
			int beatscold = 100;
			for (int i = 0; i <= 1;i++) {
				System.out.println("День: " + temperature7[i] +  " → " + Math.round((int) temperature7[i]);
			}
		}

}
