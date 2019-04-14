package JavaProgrammingInterview;

public class MissingNumberInArray {

	public static void main(String args[]) 
	{
		int a[]= {1,2,3,4,6,7};
		int sum=0;
		int sum1=0;
		for(int i=0;i<=a.length-1;i++) 
		{
			sum = sum+a[i];
			
		}
		
		for(int j=1;j<=7;j++) 
		{
		sum1= sum1+j;	
			
		}
		
		System.out.println(sum1-sum);
		
	}
	
	
}
