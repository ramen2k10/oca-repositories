interface I1{
 default int doStuff(){
   System.out.println("This is default method call");
   return 10;
 }
 
  default int doSome(){
   System.out.println("This is default method call from I2");
   return 14;
 }
 
 static int display(){
	System.out.println("This is static method call");
	return 11;
 }
}