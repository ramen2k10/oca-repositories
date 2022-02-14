public class UseAnimal{
 public static void main(String[] args){
  Animal objAnimal = new Animal();
  Dog objDog = new Dog();
  objAnimal.eat();
  objDog.eat();
  objDog.eat("Potato");
  
  //((Dog)new Animal()).eat();
  ((Animal)new Dog()).eat();
 }
}