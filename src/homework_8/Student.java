package homework_8;

public class Student {
    private String name;
    private int grade;
    private static int totalStudents = 0;
    
    public Student(String name, int grade) {
        // TODO: инициализация + totalStudents++
    	
    }
    
    public int getStatus() {
        // TODO: if-else по grade
    	if (grade >= 90) {
    		System.out.println("Отлично");
    	}else if (grade >= 70) {
    		System.out.println("Хорошо");
    	}else if (grade >= 50) {
    		System.out.println("Удовл.");
    	}else {
    		System.out.println("Неуд.");
    	}
    	return grade;
    }
    
    public static int getTotalStudents() { return totalStudents; }
    
    @Override
    public String toString() {
        // TODO: "Student{name='...', grade=..., status='...'}"
    }
}
