import food.Fruit;

class Apple extends Fruit{
 public String getFruitName(){
  System.out.println("Apple");
   return "Apple";
 }

 public static void main(String[]  args ){
  Apple ap = new Apple();
  ap.getFruitName();
  Fruit fp = new Apple();
  
 }
}