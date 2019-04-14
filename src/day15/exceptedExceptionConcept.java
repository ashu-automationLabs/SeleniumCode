package day15;

import org.testng.annotations.Test;

public class exceptedExceptionConcept {

	
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void numberexception() 
	{
		 int[] a= {10,20,30,40,50};
		 System.out.println(a[5]);
		
		
	}
	
	
}
