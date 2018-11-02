package NewAssignment3;

public class AccountSingleton {
	// static variable single_instance of type Singleton
	private static AccountSingleton single_instance = null;
	
	// variable of type String
	public String payable;
	public String receivable;
	
	// private constructor restricted to this class itself
	private AccountSingleton() {
		payable = "No";
		receivable = "No";
	}
	
	// static method to create instance of Singleton class
	public static AccountSingleton getInstance() {
		if(single_instance == null) {
			single_instance = new AccountSingleton();
		}
		
		return single_instance;
	}
}
