package classwork_115;

public class Person {
		String name;
		int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
			if (age < 0) {
				System.out.println("Eror");
			}
		}
		
}
