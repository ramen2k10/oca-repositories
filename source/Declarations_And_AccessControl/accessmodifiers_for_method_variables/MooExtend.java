class MooExtend extends Zoo{
 public static void main(String[] args){
  MooExtend obj = new MooExtend ();
  obj.getMooOfZoo();
  obj.getMooOfZooWithReference();
 }
 public void getMooOfZoo(){
  System.out.println("Zoo Method"+ this.getZoo());
 }

 public void getMooOfZooWithReference(){
 Zoo ob=new Zoo();
  ob.getZoo();
 }
}