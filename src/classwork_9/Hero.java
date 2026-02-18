package classwork_9;

public class Hero {
	String name;
	int health;
	int strength;
	int level;
	
	 public Hero(String name, int health, int strength, int level) {
		 this.name = name;
		 this.health = health;
		 this.strength = strength;
		 this.level = level;
	 }
	 
	 public void attack() {
		 String name = "hafiz";
		 int strength = 30;
		 System.out.println("Герой атакует с силой " + strenght);
	 }
	 
	 public void takeDamage() {
		 int health = 100;
		 int damage = 30;
		 System.out.println(health - damage);
	 }
	 
	 public void showinfo() {
		 System.out.println(name);
		 System.out.println(strength);
		 System.out.println(health);
		 System.out.println(level);
	 }
	 
	 
	 
}	
