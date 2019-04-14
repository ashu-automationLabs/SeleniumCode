package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertionConcept {

//Soft Assertion allows to execute code further but it was not in the case of Hard Assertion.
//In a real time project it's a best practise to use mixture of both i.e Soft Assertion +Hard Assertion
	
	
	
SoftAssert softAssert= new SoftAssert();	
@Test
public void login() 
{

System.out.println("Page Title Verfication");
softAssert.assertEquals("Login Test", "Login 322Test","My title not matched");

System.out.println("Login into the System");
Assert.assertEquals("Login into the System", "Login into the System");
System.out.println("Boolean check");
softAssert.assertEquals(true, false);
System.out.println("Int check");
softAssert.assertEquals(5, 4, "Not matched");


softAssert.assertAll();

}
	
	
	
	
}
