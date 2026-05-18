package homework_17;

public class Homework_17 {
	public static void main(String[] args) {
		System.out.println(2+3);
		int x = 0;
		System.out.println(x++);
		//во втором он сперва 0 потом становиться 1 а во первым он всегда выдаёт 5
		
		System.out.println(7/2);
		System.out.println(7.0/2);
		//во первом он округляет ответ до меньшего а во втором он даёт точный ответ
		
		System.out.println((2+3)*4);
		System.out.println(2+3*4);
		
		String s="a";
		System.out.println(s instanceof String);
		//оно выводит тру потому что его instanceof стринг и это правильно
		
		int s1 = 10;
		System.out.println(s1 += 5);
		System.out.println(s1 *= 2);
		System.out.println(s1 %= 2);
		
		byte b=100; b+=50;
		System.out.println(b);
		
		int k=1; k++;
		
		
	}
}
