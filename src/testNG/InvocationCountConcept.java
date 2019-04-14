package testNG;

import org.testng.annotations.Test;

public class InvocationCountConcept {

//Important for interview	
@Test(invocationCount=5)
public void sum() 
{
	int a =10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
	
}
