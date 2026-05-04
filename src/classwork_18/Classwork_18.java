package classwork_18;

public class Classwork_18 {
	public static void main(String[] args) {
		int number = -7;
		if (number < 0) {
			System.out.println("Число отрицательное");
		}else if (number > 0) {
			System.out.println("Число положительное");
		}else {
			System.out.println("Число равно нулю");
		}
		
		number = 14;
		if (number % 2 == 0) {
			System.out.println("Чётное число");
		}else {
			System.out.println("Нечётное число");
		}
		
		int a = 25;
		int b = 31;
		if (a > b) {
			System.out.println("Большее число: " + a);
		}else if (a < b) {
			System.out.println("Большее число: " + b);
		}else {
			System.out.println("Числа равны");
		}
	}
}
