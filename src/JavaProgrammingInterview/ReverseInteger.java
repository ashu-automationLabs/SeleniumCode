package JavaProgrammingInterview;

public class ReverseInteger {
  //654321
	
	public static void main(String args[]) {
	int num =123456;
	int rev=0;
	//1.Using while loop
	
	while(num!=0) 
	{
		rev=rev*10+num%10; // rev=0+6=60+5=654
		num=num/10;//12345,1234
		
		
	}
	System.out.println(rev);
	//2. StringBuffer...convert your number to String
    int num1=1234;
	System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	
	}
	
}
