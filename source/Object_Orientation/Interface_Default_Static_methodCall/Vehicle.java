interface Vehicle{
	default int getEngineNumber(){
		System.out.println("The engine number of the vehicle");
		return 1002;
	}
}