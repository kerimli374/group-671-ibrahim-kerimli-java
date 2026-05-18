package classwork_19;

import java.util.Scanner;

public class Classwork_19 {
	public static void main(String[] args) {
		for(int i = 1;i <= 10; i++) {
			System.out.println(i);
		}
		for(int i = 0;i <= 20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		int sum = 0;
		for(int i = 0;i<= 1000;i++) {
			sum+=i;
		}
		System.out.println(sum);
		for(int i = 1;i <= 10; i++) {
			System.out.println("7 x " + i +" = "+7*i);
		}
		int number = 4567;
		System.out.println(number % 10 + number % 10 - 1 + number % 10 - 2 +number % 10 - 3);
		String password = "java123";
		Scanner s = new Scanner(System.in);
		for(;;) {
			String entered = s.nextLine();
			if(password.equals(entered)) {
				break;
			}
		}
		for(int i = 1;i <= 20;i++) {
			if(i%3==0) {
				continue;
			}else {
				System.out.println(i);
			}
		}
		for(int i=1;i <= 100;i++) {
			if (i == 26) {
				break;
			}else {
				System.out.println(i);
			}
		}
		for(int i = 1;i <= 10 ; i++) {
			for(int j = 1;j <= 10;j++) {
				System.out.println(i + " x " + j +" = "+i*j);
			}
		}
		
}
}