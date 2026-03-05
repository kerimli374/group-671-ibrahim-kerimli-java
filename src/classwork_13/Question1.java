package classwork_13;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter number");
		int a1 = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter number");
		int a2 = s2.nextInt();
		System.out.println(a1 + a2);
		System.out.println(a1-a2);
		System.out.println(a1 * a2);
		System.out.println(a1 / a2);
	}
}
