package testNG;

import org.testng.annotations.Test;

public class ExceptedErrorConcept {

	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void error() 
	{
		int a[]= {1,2,3,5,6,7};
		
		System.out.println(a[8]);
	}

	@Test(expectedExceptions=ArithmeticException.class)
	public void infinity() 
	{
		int a=1/0;
		System.out.println(a);
	
	}
	
	
	
	
}
