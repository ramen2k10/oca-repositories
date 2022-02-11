public class SamsungWatch extends SmartWatch{
	// Though the class has extended the superclass but the method signature is different so it is not an overring 
	public int showTime(int format){
	System.out.println("This is * O clock");
	return 0;
	}
	
	public void syncWithPhone(String email){
	 System.out.println("Connected to to your samsung phone");
	}
	
	//As the super class has declare public method so overring method should have same signature othewise compile time error
	/*
	private void showStepsCount(){
	 System.out.println("Samsung Steps count is : "+200);
	}
	*/
}