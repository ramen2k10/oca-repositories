public class UseAnimal{
 public static void main(String[] args){
  Animal objAnimal = new Animal();
  Dog objDog = new Dog();
  UseAnimal test = new UseAnimal();
  test.doStuff(objAnimal);
  test.doStuff(objDog);
  
  //Object reference 
  Animal refObjOfAnimal = new Dog();
  test.doStuff(refObjOfAnimal);
 }
 
 public void doStuff(Animal anmal){
	System.out.println("This is Animal Object");
 }
 
 public void doStuff(Dog objDog){
	System.out.println("This is Dog object");
 }
}