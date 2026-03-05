package classwork_13;

import java.util.Scanner;

public class Question2 {
	
		public static void isLuckyTicket() {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter number");
			String a1 = s.nextLine();
			String[] nums = a1.split("");
			System.out.println(nums[0]);
		}
	
}
