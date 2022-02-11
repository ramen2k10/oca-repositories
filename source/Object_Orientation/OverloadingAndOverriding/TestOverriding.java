class TestOverriding{
  public static void main(String args[]){
   SmartWatch sWatch = new SmartWatch();
   //showTime has a private access so can not compile 
   //sWatch.showTime("");
   SamsungWatch ssWatch = new SamsungWatch();
   ssWatch.showTime(0);
   
   SmartWatch samsungWatch = new SamsungWatch();
   sWatch.syncWithPhone("ra2k10@gmail.com");
   //object reference is type of super but the initialization is sub type so called the sub class method.
   samsungWatch.syncWithPhone("ra2k10@gmail.com");
   
    SmartWatch sCount = new SmartWatch();
	SmartWatch sSCount = new SamsungWatch();
	sCount.showStepsCount();
	//if the sub class already override it then sub class method will call otherwise superclass call
	sSCount.showStepsCount();
	
	// As method is declare with private show can not override and can not call also.
	/*
	SmartWatch sRmp = new SamsungWatch();
	sRmp.showRPM();
	SamsungWatch sSRmp = new SamsungWatch();
	sRmp.showRPM();
	*/
  }
}