package JavaProgrammingInterview;

public class RemoveJunk {

	
	public static void main(String args[]) {
	String s="CUS%^&**T線上891英漢字典／";
    System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
    
	
	}
}
