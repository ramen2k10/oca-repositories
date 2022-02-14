public class UseAnimal{
 public static void main(String[] args){
  Animal objAnimal = new Animal();
  Dog objDog = new Dog();
  objAnimal.eat();
  objDog.eat();
  
  //Object reference 
  Animal refObjOfAnimal = new Dog();
  refObjOfAnimal.eat();
  //refObjOfAnimal.eat("Chicken");
 }
}