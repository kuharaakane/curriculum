package check;

import constants.Constants;

public class Check {
	private String firstName = "工原";
	private String lastName = "紅音";
	
	private void printName (String firstName, String lastName) {
		System.out.println("printNameメソッド→" + this.firstName + this.lastName );
	}
	 
 public static void main(String[]args) { 
 
	 Check cc = new Check();
	 cc.printName(cc.firstName, cc.lastName);
	  
	 Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
	 pt.introduce();
	 
	 RobotPet rp = new  RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
	 rp.introduce();
	 
	 
	
 }
}