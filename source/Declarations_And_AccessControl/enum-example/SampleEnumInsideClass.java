class Coffee{
 enum CoffeeSize{BIG, HUGE, OVERWHELMING}
 CoffeeSize size;
}

class SampleEnumInsideClass{
 public static void main(String[] args){
  Coffee c=new Coffee();
  c.size = Coffee.CoffeeSize.BIG;
 }
}