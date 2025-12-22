package classwork_1;

public class Classwork_1  {
	public static void main(String[] args) {
		int age = 10;
		if (age < 18) {
			System.out.println("Доступ запрешён");
		}
		
		int temperature = 18;
		
		if (temperature < 0) {
			System.out.println("Холодно");
		} else {
			System.out.println("Тепло");
		}
		
		int mark = 4;
		
		switch(mark) {
			case 5 -> System.out.println("Отлично");
			case 4 -> System.out.println("Хорошо");
			case 3 -> System.out.println("Удовлетворительно");
			case 2 -> System.out.println("Неудовлетворительно");
			default -> System.out.println("Некорректная оценка");
		}
		
		int month = 1;
		
		
	}
}
