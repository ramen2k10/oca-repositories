class Child extends Parent{
 public static void main(String[] args){
  Child obj=new Child();
  System.out.println(obj.getParent()); 
 }
 public String getParent(){
  //compilation error private method can't be access
 //System.out.println("Show Parent "+this.showParent()); 
  return "Hello";
 }
}