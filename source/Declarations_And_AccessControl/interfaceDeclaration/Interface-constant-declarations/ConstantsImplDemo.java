class ConstantsImplDemo implements InterfaceConstantDemo{
 public void go(){
  //MAX = 72;
  System.out.println("Value "+MAX);
  System.out.println("Value "+x);
  System.out.println("Value "+y);
  System.out.println("Value "+z);
  System.out.println("Value "+m);
  System.out.println("Value "+n);
  System.out.println("Value "+k);
  System.out.println("Value "+j);
 }

 public static void main(String[] args){
  ConstantsImplDemo demo = new ConstantsImplDemo ();
  demo.go(); 
 }
}