class DefaultMethodCall implements I1, I2{
	public static void main(String[] args){
		//I1 object = new DefaultMethodCall();
		//object.doStuff();
		System.out.println("This is static method call "+doStuff());
		DefaultMethodCall object1 = new DefaultMethodCall();
		object1.go();
	}
	
	public void go(){
		//System.out.println("This is static method call "+I1.display());
		System.out.println("This is static method call "+DefaultMethodCall.display());
		//System.out.println("This is static method call "+doStuff());
		//System.out.println("This is static method call "+display());
		System.out.println("This is static method call "+doSome());
		
	}
	
	 public int doSome(){
		System.out.println("This is default method call from DefaultMethodCall");
		return 14;
	 }
}