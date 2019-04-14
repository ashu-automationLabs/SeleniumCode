package day16;

import org.testng.annotations.Test;

public class DisableConcept {

	
	@Test(priority=1)
	public void sum() 
	{
	System.out.println("This is my Sum testcase");	
		
	}
	
	@Test(priority=2,enabled=false)
	public void subtraction() {
		System.out.println("This is my substraction testcase");
		
	}
	
	
}
