interface InterfaceDefaultMethodTest{
 default int m1(){
  System.out.println("This is interface defaut method -");
   return 1;
 }

 public default int m2(){
  System.out.println("This is interface defaut method -");
   return 1;
 }

 //static default int m3(){
 // System.out.println("This is interface static defaut method -");
 //  return 1;
 //}- illegal method declr
 
 //default abstract int m4(); //- illegal method declr
}