package pkg_other;
import pkg_cert.*;
class AudiCar extends SportsCar{
 public static void main(String[] args){
  AudiCar cObj=new AudiCar();
   System.out.println(cObj.getProtectedMembers());
 }
 
 public String getProtectedMembers(){
  System.out.println("Members of super class "+maxSpeed);
  // member has protected access in this class so reference not allowed as protected
  //SportsCar sc=new SportsCar();
  //System.out.println("Members of super class "+sc.maxSpeed);
  return "accessed";
 }
}