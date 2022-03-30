public class InitializationBlockExample{
	public InitializationBlockExample(){
		System.out.println("This is No argument const");
	}
	
	public InitializationBlockExample(String s){
		System.out.println("This is params const");
	}
	
	static{
		System.out.println("This is static block 1");
	}
	
	{
		System.out.println("This is Init block 1");
	}
	static{
		System.out.println("This is static init block 2");
	}
	{
		System.out.println("This is Init block 2");
	}
	
	public static void main(String[] args ){
		InitializationBlockExample demo = new InitializationBlockExample();
		InitializationBlockExample demo2=new InitializationBlockExample("Hello");
	}
}