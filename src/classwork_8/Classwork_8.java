package classwork_8;

import java.util.Scanner;

public class Classwork_8 {
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter number");
			int a = s.nextInt();
			if (a % 2 == 0) {
				System.out.println("Чётное");
			}else {
				System.out.println("Нечётное");
			}
			
			if (a > 0) {
				System.out.println("Положительное");
			}else if (a < 0) {
				System.out.println("Отрицательное");
			}else {
				System.out.println("Ноль");
			}
			
			for(int i = 0; i <= 10; i++) {
				System.out.println(5 * i);
			}
			
			int sum = 0;
			for (int i = 0; i<=100; i++ ) {
				sum += i;
			}
			
			
		}
}