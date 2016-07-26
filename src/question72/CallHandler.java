package question72;

public class CallHandler<T extends Employee> {
	public static CallHandler instance;
	
	
	public void DispatchCall(T employee) {
		
	}
	
	public static CallHandler getInstance() {
		if (instance == null) {
			instance = new CallHandler();
		}
		return instance;
	}
	
	

}
