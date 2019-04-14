package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
	
		// HashMap is a class implementation of Map Interface
		// extends AbstractMap(Class)
		// it contains only unique elements 
		// stores the values- key- value pair
		// it may have one null key and multiple null values
		// it maintains no order

		HashMap<Integer, String>  hm= new HashMap<Integer,String>();
		
		hm.put(1,"Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestCommplete12");
		hm.put(4, "RFT");
		
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		
		//All the value in HashMap
		for(Entry m: hm.entrySet()) 
		{
	              System.out.println(m.getKey()+ " "+m.getValue() );
			
		}
		
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		
		HashMap<Integer, Employee> emp = new HashMap<Integer,Employee>();
		
		Employee e1= new Employee("Shruti", 28, "QA");
		Employee e2= new Employee("Ashu", 29, "QA-Auto");
		Employee e3= new Employee("Shruti Verma", 26, "QA-Manual");
	
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3,e3);
		
		
		//How you can traverse the HashMap
		for(Entry<Integer,Employee> m:emp.entrySet()) 
		{
			int Key= m.getKey();
			Employee e = m.getValue();
			System.out.println(Key +"Info:");
			
			System.out.println(e.name+ " "+e.age+ " "+e.dept);
			
			
			
		}
		
		
	}

}
