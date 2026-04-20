package homework_8;

public class Bank {
	 private static Bank instance;
	    private int balance = 0;
	    
	    private Bank() {} // конструктор закрыт!
	    
	    public static Bank getInstance() {
	        // TODO: если instance == null, создать new Bank()
	        // TODO: вернуть instance#
	    	if (instance == null) {
	    		  instance = new Bank();
	    		}
	    		return instance;
	    }
	    
	    public void deposit(int amount) { balance += amount; }
	    public int getBalance() { return balance; }
}
