package JavaProgrammingInterview;

public class DuplicateinArray {

	public static void main(String[] args) {
		
		String array[]= {"Java","Selenium","Ruby","Java"};
		
		for(int i=0; i<=array.length-1;i++) 
		{
			for(int j=i+1;j<=array.length-1;j++) 
			{
				if(array[i].equals(array[j])) 
				{
					System.out.println(array[i]); 
					
				}
				
			}
			
		}

	}

}
