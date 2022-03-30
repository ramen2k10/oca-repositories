public class Innova extends Car{
 public static void main(String[] args){
	Vehicle obj=new Innova();
	System.out.println("Num is : "+obj.getEngineNumber());
	Car obj1=new Car();
	System.out.println("Num is : "+obj1.getEngineNumber());
	Innova obj2=new Innova();
	System.out.println("Num is : "+obj2.getEngineNumber());
 }
 
 	public int getEngineNumber(){
		System.out.println("The engine number of the Car");
		return 1004;
	}
}