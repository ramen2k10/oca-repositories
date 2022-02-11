public class SmartWatch{
	//showTime has a private access
	private String showTime(String format){
		System.out.println("8-Clock");
		return format;
	}	
	
	public void syncWithPhone(String email){
	 System.out.println("Connected to to phone");
	}
	
	public void showStepsCount(){
	 System.out.println("Steps count is : "+100);
	}
	
	//method which sub class has not override it
	private void showRPM(){
	 System.out.println("RPM is : "+120);
	}
}	