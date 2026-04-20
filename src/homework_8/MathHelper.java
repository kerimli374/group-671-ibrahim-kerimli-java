package homework_8;

public class MathHelper {
  // TODO: закрыть конструктор
    
    public static int square(int n) {
        // TODO
    	n = n*n;
    	return n;
    }
    
    public static boolean isEven(int n) {
        // TODO
    	if (n % 2 == 0) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public static int max(int a, int b) {
        // TODO
    	if (a > b) {
    		return a;
    	}else {
    		return b;
    	}
    }
}
